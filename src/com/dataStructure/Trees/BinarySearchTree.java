package com.dataStructure.Trees;

import jdk.nashorn.api.tree.Tree;

class TreeNode{
    int data;
    TreeNode left, right;
    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BinarySearchTree {
    TreeNode root;
    public BinarySearchTree(){
        this.root = null;
    }

    public TreeNode search(TreeNode root, int data){
        if(root.data == data){
            return root;
        }else if(root.data > data){
            return search(root.left, data);
        }else if(root.data < data){
            return search(root.right,data);
        }
        return null;
    }

    public void insert(int[] keys){
        TreeNode node = null;
        for(int i=0; i<keys.length; i++){
           node = insertUtil(node, keys[i]);
        }

    }

    public TreeNode insertUtil(TreeNode root, int data){
        if(root == null){
            root = new TreeNode(data);
        }
        if(root.data > data){
            root.left = insertUtil(root.left, data);
        }else if(root.data < data){
            root.right = insertUtil(root.right, data);
        }

        this.root = root;
        return root;
    }

    public void deleteNode(){

    }

    public void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }
}

