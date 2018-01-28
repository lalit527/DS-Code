package com.dataStructure.Trees;

public class TreeMain {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insertLevelOrder(arr, bt.root, 0);
        bt.levelOrder(bt.root);
    }
}
