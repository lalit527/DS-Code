package com.dataStructure.Trees;
import  com.dataStructure.Trees.BinaryTree;
public class VerifyTrees {
    public boolean isIdentical(BinaryTree.TreeNode t1, BinaryTree.TreeNode t2){
        if(t1==null && t2 == null){
            return true;
        }

        if((t1!=null && t2==null) || (t2==null && t1!=null) ){
            return false;
        }

        return ((t1.data == t2.data) && isIdentical(t1.rightChild, t2.rightChild) && isIdentical(t1.leftChild , t2.leftChild));
    }

    public boolean isMirror(BinaryTree.TreeNode t1, BinaryTree.TreeNode t2){
        if(t1==null && t2 == null){
            return true;
        }

        if((t1!=null && t2==null) || (t2==null && t1!=null) ){
            return false;
        }

        return ((t1.data == t2.data) && isMirror(t1.leftChild,t2.rightChild) && isMirror(t1.rightChild , t2.leftChild));
    }
}
