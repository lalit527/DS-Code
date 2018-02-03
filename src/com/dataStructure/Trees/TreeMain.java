package com.dataStructure.Trees;
import com.dataStructure.Trees.BinaryTree;
public class TreeMain {
    public static void main(String[] args){
        /*int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insertLevelOrder(arr, bt.root, 0);
        bt.inOrder(bt.root);
        System.out.println("");
        //BinaryTree.TreeNode tn = bt.commonLCA(bt.root, 8, 5);
        //bt.mirrorTree(bt.root);
        //System.out.println(tn.data);
        bt.inOrder(bt.root);
        System.out.println("");
        BinaryTree bt2 = new BinaryTree();
        bt2.root = bt.insertLevelOrder(arr, bt.root, 0);
        //VerifyTrees vt = new VerifyTrees();


        *//*int height = bt.getHeight(bt.root);
        bt.sumTree(bt.root);
        System.out.println("");
        bt.inOrder(bt.root);*//*

        //System.out.println(height);
        DeepestNode dn = new DeepestNode();
        int value = dn.deepestNode(bt.root);
        System.out.println(value);

        //view tree
        ViewTree v = new ViewTree();
        v.leftViewRec(bt.root);*/

        /*int in[] = new int[]{4, 8, 2, 5, 1, 6, 3, 7};
        int post[] = new int[]{8, 4, 5, 2, 6, 7, 3, 1};
        int pre[] = new int[]{1, 2, 4, 8, 5, 3, 6, 7};
        BinaryTree bt3 = new BinaryTree();
        bt3.createTree(in, post);
        bt3.preOrder(bt3.root);
        System.out.println("");
        BinaryTree bt4 = new BinaryTree();
        bt4.buildTree(in, pre);
        bt4.preOrder(bt4.root);*/
        int[] arr = {50, 30, 20, 40, 70, 60, 80};
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(arr);
        bst.inorderRec(bst.root);
    }
}
