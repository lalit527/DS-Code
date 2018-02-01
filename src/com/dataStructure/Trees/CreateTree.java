package com.dataStructure.Trees;

import static com.dataStructure.Trees.BinaryTree.*;

class Index{
    int index;
}

public class CreateTree {

    public BinaryTree.TreeNode createTreeUtil(int[] in, int[] post, int start, int end, Index index){
        if(start > end){
            return null;
        }

        //BinaryTree.TreeNode node = new BinaryTree.TreeNode(post[index.index]);
        return null;
    }
    public BinaryTree.TreeNode createTree(int[] in, int[] pre){
        int n = in.length;
        Index pIndex = new Index();
        pIndex.index = n - 1;
        return createTreeUtil(in, pre, 0, n-1, pIndex);
    }
}
