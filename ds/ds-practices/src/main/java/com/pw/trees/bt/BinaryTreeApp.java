package com.pw.trees.bt;

public class BinaryTreeApp {



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BTNode root = new BTNode(1);
        binaryTree.setRoot(root);

        BTNode h1Left = new BTNode(2);
        BTNode h1Right = new BTNode(3);
        root.setLeft(h1Left);
        root.setRight(h1Right);
        BTNode h2LLeft = new BTNode(4);
        BTNode h2LRight = new BTNode(5);
        root.getLeft().setLeft(h2LLeft);
        root.getLeft().setRight(h2LRight);
        BTNode h2RLeft = new BTNode(6);
        BTNode h2RRight = new BTNode(7);
        root.getRight().setLeft(h2RLeft);
        root.getRight().setRight(h2RRight);
        System.out.println("InOrder Recursion: "+binaryTree.getInOrderRecursionResult());
        System.out.println("InOrder Iteration: "+binaryTree.getInOrderIterationResult());
        System.out.println("------------------------------------------------------");
        System.out.println("PreOrder Recursion: "+binaryTree.getElementsByPreOrder());
        System.out.println("PreOrder Iteration: "+binaryTree.getPreOrderIterationResult());
        System.out.println("------------------------------------------------------");
        System.out.println("PostOrder Recursion: "+binaryTree.getElementsByPostOrder());
    }
}
