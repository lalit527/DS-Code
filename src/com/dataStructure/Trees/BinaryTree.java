package com.dataStructure.Trees;
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


}
