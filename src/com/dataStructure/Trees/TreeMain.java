package com.dataStructure.Trees;
import com.dataStructure.Trees.BinaryTree;
public class TreeMain {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insertLevelOrder(arr, bt.root, 0);
        bt.inOrder(bt.root);
        System.out.println("");
        //BinaryTree.TreeNode tn = bt.commonLCA(bt.root, 8, 5);
        bt.mirrorTree(bt.root);
        //System.out.println(tn.data);
        bt.inOrder(bt.root);
        System.out.println("");
        BinaryTree bt2 = new BinaryTree();
        bt2.root = bt.insertLevelOrder(arr, bt.root, 0);
        //VerifyTrees vt = new VerifyTrees();


        /*int height = bt.getHeight(bt.root);
        bt.sumTree(bt.root);
        System.out.println("");
        bt.inOrder(bt.root);*/

        //System.out.println(height);
        DeepestNode dn = new DeepestNode();
        int value = dn.deepestNode(bt.root);
        System.out.println(value);

    }
}
