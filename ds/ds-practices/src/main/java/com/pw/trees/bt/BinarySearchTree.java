package com.pw.trees.bt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {

    public BTNode insert(BTNode root, int data){
        if(root== null){
            root = new BTNode(data);
        }else if(root.data < data){
            root.right = insert(root.right, data);
        }else if(root.data >data){
            root.left = insert(root.left, data);
        }
        return root;
    }

    public BTNode delete(BTNode root, int data){
        if(root == null){
            System.out.println("No Element found in tree");
        }else if(data < root.data){
            root.left = delete(root.left, data);
        }else if(data > root.data){
            root.right = delete(root.right, data);
        }else {
            //Found the element
            //if it has both the subtrees are not empty
            if(root.left!=null && root.right !=null){
                /*replace largest value in left subtree*/
                BTNode tmp = findMax(root.left);
                root.data = tmp.data;
                root.left = delete(root.left,root.data);
            }else{
                // if it has only one child
                if(root.left == null)
                    return root.right;
                if(root.right == null)
                    return root.left;
            }
        }
        return root;
    }

    private BTNode findMax(BTNode root) {
        if(root ==null){
            return null;
        }
        while (root.right!=null){
            root = root.right;
        }
        return root;
    }

    public List<Integer> getLevelOrderTraversalResult(BTNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while (!queue.isEmpty()){
            BTNode current = queue.poll();
            if(current == null){
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }else {
                res.add(current.data);
                if(current.left !=null)
                    queue.offer(current.left);
                if(current.right != null)
                    queue.offer(current.right);
            }
        }
        return res;
    }
}
