package com.pw.trees.bt;

public class BinarySearchTreeApp {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        BTNode root = new BTNode(5);
        bst.insert(root, 3);
        bst.insert(root, 8);
        bst.insert(root, 2);
        bst.insert(root, 4);
        bst.insert(root, 7);
        bst.insert(root, 9);

        System.out.println("Binary Search Tree");
        System.out.println(bst.getLevelOrderTraversalResult(root));
        System.out.println("After deleting 8 node");
        bst.delete(root, 8);
        System.out.println(bst.getLevelOrderTraversalResult(root));
        System.out.println("After deleting 5 node");
        bst.delete(root, 5);
        System.out.println(bst.getLevelOrderTraversalResult(root));
    }
}
