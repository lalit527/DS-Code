package com.dataStructure.Trees;
import com.dataStructure.Trees.BinaryTree;
import com.dataStructure.Trees.LevelClass;

import java.util.logging.Level;

public class DeepestNode {

    public static  void find(BinaryTree.TreeNode root, int tmpLevel, LevelClass level){
        if(root!=null){
            find(root.leftChild, ++tmpLevel, level);
            //System.out.println(level.level+ "--" +level.node);
            if(tmpLevel > level.level){
                level.node = root.data;
                level.level = tmpLevel;
            }

            find(root.rightChild, tmpLevel, level);
            //System.out.println(level.level+ "--"+level.node);
        }
    }
    public int deepestNode(BinaryTree.TreeNode root){
        LevelClass level = new LevelClass();
        find(root, 0, level);
        return level.node;
    }
}
