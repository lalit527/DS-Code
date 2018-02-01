package com.dataStructure.Trees;
import jdk.nashorn.api.tree.Tree;

import java.util.*;

public class BinaryTree {
    TreeNode root;

    class TreeNode{
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
            this.leftChild = null;
               this.rightChild = null;
        }
    }

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
         if(i<arr.length){
            TreeNode tmp = new TreeNode(arr[i]);
            root = tmp;
            root.leftChild = insertLevelOrder(arr, root.leftChild, 2*i+1);
            root.rightChild = insertLevelOrder(arr, root.rightChild, 2*i+2);
         }
         return  root;
    }

    public void inOrder(TreeNode root){
        if (root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }

    public void levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root !=null){
           q.add(root);
           while(!q.isEmpty()){
               TreeNode tmp = null;
               tmp = q.remove();
               System.out.print(tmp.data + " ");
               if(tmp.leftChild != null){
                   q.add(tmp.leftChild);
               }

               if(tmp.rightChild != null){
                   q.add(tmp.rightChild);
               }
           }
        }
    }

    public int getHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lh = getHeight(root.leftChild);
        int rh = getHeight(root.rightChild);

        return lh>rh?lh+1:rh+1;
    }

    public void sizeReplace(TreeNode root) {
        if(root == null){
            return;
        }
        int lh = getHeight(root.leftChild);
        int rh = getHeight(root.rightChild);

        root.data = lh>rh?lh+1:rh+1;
    }

    public int sumTree(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = sumTree(root.leftChild);
        int rh = sumTree(root.rightChild);
        root.data = lh + rh + root.data;
        return  root.data;
    }

    public boolean nodeExists(TreeNode root, int n1) {

        if (root.data == n1) {
            return true;
        }

        if(root.leftChild != null && nodeExists(root.leftChild, n1)){
            return true;
        }
        if(root.rightChild != null && nodeExists(root.rightChild, n1)){
            return true;
        }
        return false;
    }

    public TreeNode commonLCA(TreeNode root, int n1, int n2){
        if(root == null){
            return null;
        }

        if(root.data == n1 || root.data == n2){
            return root;
        }

        TreeNode LCA = commonLCA(root.leftChild, n1, n2);
        TreeNode RCA = commonLCA(root.rightChild, n1, n2);

        if(LCA != null && RCA != null){
            return root;
        }

        if(LCA == null && RCA != null){
            return RCA;
        }

        if(LCA != null && RCA == null){
            return LCA;
        }

        return null;

    }

    private void swapHelper(TreeNode root){
        TreeNode tmp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = tmp;
    }
    /*
    mirror/ invert a Binary Tree

     */
    public void mirrorTree(TreeNode root) {
        if(root == null){
            return;
        }
        mirrorTree(root.leftChild);
        mirrorTree(root.rightChild);
        swapHelper(root);
    }

    /*
    create Tree from in and post order
     */
    public int search(int[] in, int start, int end, int data){
        int i = -1;
        for(i=start; i<end; i++){
            if(in[i] == data){
                break;
            }
        }
        return i;
    }
    public TreeNode createTreeUtil(int[] in, int[] post, int start, int end, Index index){
        if(start > end){
            return null;
        }

        TreeNode node = new TreeNode(post[index.index]);
        index.index--;

        if(start == end){
           return node;
        }

        int inIndex = search(in, start, end, node.data);
        node.rightChild = createTreeUtil(in, post, inIndex+1, end, index);
        node.leftChild = createTreeUtil(in, post, start, inIndex-1, index);

        return node;
    }
    public TreeNode createTree(int[] in, int[] post){
        int n = in.length;
        Index pIndex = new Index();
        pIndex.index = n - 1;
        this.root = createTreeUtil(in, post, 0, n-1, pIndex);
        return this.root;
    }
}
