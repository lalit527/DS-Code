package com.dataStructure.BST;
import java.util.*;
public class BST {
    TreeNode root;
    class TreeNode {
        int data;
        TreeNode left, right, parent;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public BST() {
        this.root = null;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        insert(this.root, node, null);
    }

    private TreeNode insert(TreeNode root, TreeNode node, TreeNode parent) {
        if(root == null) {
            root = node;
            node.parent = parent;
        }else if(root.data > node.data) {
            root.left = insert(root.left, node, root);
        }else if(root.data < node.data) {
            root.right = insert(root.right, node, root);
        }
        this.root = root;
        return root;

    }

    public boolean treeSearch(int key) {
        return treeSearch(this.root, key);
    }

    private boolean treeSearch(TreeNode root, int key) {
        if(root == null) {
            return false;
        }
        if(key == root.data) {
            return true;
        }else if(root.data < key) {
            return treeSearch(root.right, key);
        }else{
            return treeSearch(root.left, key);
        }
    }


    public int treeMinimum() {
        return treeMinimum(this.root);
    }

    private int treeMinimum(TreeNode root){
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public int treeMaximum() {
        return treeMaximum(this.root);
    }

    private int treeMaximum(TreeNode root){
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    private TreeNode search(int data) {
        TreeNode tmp = this.root;
        while(tmp!=null){
            if(tmp.data == data) {
                return tmp;
            }else if(tmp.data > data){
                tmp = tmp.left;
            }else{
                tmp = tmp.right;
            }
        }
        return null;
    }

    public void transplant(int node1, int node2) {
        TreeNode tmp1 = search(node1);
        TreeNode tmp2 = search(node2);
        System.out.print("data"+tmp2.left+"*****"+tmp2.right);
        if(tmp1 != null && tmp2 != null) {
            transplant(this.root, tmp1, tmp2);
        }
    }

    private void transplant(TreeNode root, TreeNode node1, TreeNode node2) {
        if(node1.parent == null) {
            root = node2;
        }else if(node1 == node1.parent.left) {
            node1.parent.left = node2;
        }else{
            node1.parent.right = node2;
        }

        if(node2 != null) {
            node2.parent = node1.parent;
        }
    }

    public void delete(int data){
        TreeNode tmp = search(data);
        if(tmp!=null){
            delete(this.root, tmp);
        }
    }

    private void delete(TreeNode root, TreeNode node){
        if(node.left == null) {
            transplant(root, node, node.right);
        }else if(node.right == null){
            transplant(root, node, node.left);
        }else{
            TreeNode tmp = search(treeMinimum(node.right));
            if(tmp.parent != node){
                transplant(root, tmp, tmp.right);
                tmp.right = node.right;
                tmp.right.parent = tmp;
            }else{
                transplant(root, node, tmp);
                tmp.left = node.left;
                tmp.left.parent = tmp;
            }


        }
    }

    public int height() {
        return height(this.root);
    }

    private int height(TreeNode root) {
        if(this.root == null){
            return 0;
        }else{
            int lHeight = height(root.left);
            int rHeight = height(root.right);
            if(lHeight > rHeight){
                return lHeight + 1;
            }else{
                return rHeight + 1;
            }
        }
    }

    public void leftRotate(int data) {
        TreeNode node = search(data);
        leftRotate(this.root, node);
    }

    private void leftRotate(TreeNode root, TreeNode node) {
        TreeNode tmp = node.right;
        node.right = tmp.left;
        if(tmp.left!=null) {
            tmp.left.parent = node;
        }
        tmp.parent = node.parent;
        if(node.parent == null) {
            root = tmp;
        }else if(node == node.parent.left) {
            node.parent.left = tmp;
        }else{
            node.parent.right = tmp;
        }
        tmp.left = node;
        node.parent = tmp;
    }

    public void rightRotate(int data){
        TreeNode node = search(data);
    }

    public void inOrder() {
        inOrder(this.root);
    }
    private void inOrder(TreeNode root) {
        if(root!=null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }

    }

    public void preOrder() {
        preOrder(this.root);
    }
    private void preOrder(TreeNode root) {
        if(root!=null) {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    public void levelOrder() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this.root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            System.out.println(tmp.data + "-->"+(tmp.parent==null?null:tmp.parent.data));
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right != null){
                queue.add(tmp.right);
            }

        }
    }


}