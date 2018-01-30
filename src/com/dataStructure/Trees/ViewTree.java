package com.dataStructure.Trees;
import java.util.*;
public class ViewTree {

    public void leftView(BinaryTree.TreeNode root){
        Queue<BinaryTree.TreeNode> q = new LinkedList<>();
        boolean complete = false;
        if(root!=null){
            q.add(root);
            q.add(null);
            System.out.println(root.data);
            while(!complete){
                  {
                    BinaryTree.TreeNode tmp = q.poll();
                    if(tmp==null){
                        if(q.isEmpty()){
                            complete=true;
                        }else {
                            tmp = q.poll();
                            System.out.println(tmp.data);
                            q.add(null);
                            if (tmp.leftChild != null) {
                                q.add(tmp.leftChild);
                            }
                            if (tmp.rightChild != null) {
                                q.add(tmp.rightChild);
                            }
                        }
                    }else{
                        if(tmp.leftChild != null){
                            q.add(tmp.leftChild);
                        }
                        if(tmp.rightChild != null){
                            q.add(tmp.rightChild);
                        }
                    }

                }

            }

        }
    }

    /*
    Left View  Recursive Solution
     */
    public void leftViewRec(BinaryTree.TreeNode root){
       LevelClass level = new LevelClass();
       level.level = -1;
       leftViewRecUtil(root, 0, level);
    }

    public void leftViewRecUtil(BinaryTree.TreeNode root, int level, LevelClass maxLevel){
        if(root == null){
            return;
        }
        if(maxLevel.level < level){
            System.out.println(maxLevel.level + "--"+ level);
            System.out.println(root.data);
            maxLevel.level = level;
        }
        leftViewRecUtil(root.leftChild, level+1, maxLevel);
        leftViewRecUtil(root.rightChild, level+1, maxLevel);
        return;
    }
}
