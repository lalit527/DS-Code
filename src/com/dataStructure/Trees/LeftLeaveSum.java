package com.dataStructure.Trees;
import com.dataStructure.Trees.TreeNode;
public class LeftLeaveSum {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left!=null){
            if(root.left.left == null && root.left.right == null){
                sum += root.left.data;
            }else{
                sum += sumOfLeftLeaves(root.left);
            }
        }

        if(root.right != null){
            sum+= sumOfLeftLeaves(root.right);
        }

        return sum;

    }
}
