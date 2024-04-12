package org.example;

import org.w3c.dom.Node;

public class Main {
    private static boolean isBalanced = true;

    public static boolean isTreeBalanced(TreeNode root){
        height(root);
        return isBalanced;
    }
    public static int height(TreeNode node){
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());

        if (Math.abs(leftHeight-rightHeight) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args) {
        // TreeNode d = new TreeNode(5);
        // TreeNode e = new TreeNode(4);
        // TreeNode c = new TreeNode(3);
        // c.setLeft(d);
        // c.setRight(e);
        // TreeNode b = new TreeNode(2);
        // TreeNode a = new TreeNode(1);
        // a.setLeft(c);
        // a.setRight(b);


        // TreeNode dd = new TreeNode(5);
        // TreeNode cc = new TreeNode(4);
        // TreeNode bb = new TreeNode(3);
        // TreeNode ee = new TreeNode(2);
        // TreeNode aa = new TreeNode(1);

        // cc.setLeft(dd);
        // bb.setLeft(cc);
        // aa.setLeft(bb);
        // aa.setRight(ee);

        // System.out.println(height(aa));


        TreeNode n1 = new TreeNode(1);
        TreeNode n6 = new TreeNode(6,n1,null);
        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8,null,n9);
        TreeNode n7 = new TreeNode(7,n6,n8);
        
        BinaryTreeTraversal.preOrderVisit(n7);
    }
}