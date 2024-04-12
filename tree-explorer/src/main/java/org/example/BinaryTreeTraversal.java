package org.example;

public class BinaryTreeTraversal {
    

    // This function is the policy to be executed for every node.
    public static void preOrderVisit(TreeNode node){        
        if (node == null){
            return;
        }

        System.out.println(node.getData());
        preOrderVisit(node.getLeft());
        preOrderVisit(node.getRight());
    }
}

