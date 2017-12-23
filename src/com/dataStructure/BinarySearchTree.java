package com.dataStructure;

public class BinarySearchTree {

        private TreeNode root;

        class TreeNode{
            int data ;
            TreeNode leftChild;
            TreeNode rightChild;
            public TreeNode(int data){
                this.data = data;
                this.leftChild = null;
                this.rightChild = null;
            }
        }

        public BinarySearchTree(){
            this.root = null;
        }

        public void insertNode(int data){


            if(this.root == null){
                this.root = new TreeNode(data);
            }else{
                insertNodeHelper(this.root, data);

            }

        }

        public TreeNode insertNodeHelper(TreeNode root, int data){
            System.out.println(root);
            System.out.println(data);
            if (root == null){
                System.out.println("In Null");
                TreeNode t = new TreeNode(data);
                return t;
            }
            if(root.data >= data){
                root.leftChild = insertNodeHelper(root.leftChild, data);
            }else{
                root.rightChild = insertNodeHelper(root.rightChild, data);
            }
            return root;
        }

        public void preOrder(){
            preOrderHelper(this.root);
        }

        public void preOrderHelper(TreeNode root){
            if (root != null){
                System.out.println(root.data);
                preOrderHelper(root.leftChild);
                preOrderHelper(root.rightChild);
            }
        }

        public void inOrder(){
            inOrderHelper(this.root);
        }

        public void inOrderHelper(TreeNode root){
            if (root != null){
                preOrderHelper(root.leftChild);
                System.out.println(root.data);
                preOrderHelper(root.rightChild);
            }
        }

    }



