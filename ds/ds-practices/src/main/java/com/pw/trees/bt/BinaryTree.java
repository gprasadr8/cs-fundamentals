package com.pw.trees.bt;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {

    private BTNode root;

    public  BinaryTree(){
        this.root = null;
    }

    public BinaryTree(BTNode root){
        this.root = root;
    }

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public int size(){
        return 0;
    }

    public List<Integer> getInOrderRecursionResult(){
        final  List<Integer> result = new ArrayList<>();
        inOrderRecursion(this.root, result);
        return result;
    }

    public List<Integer> getInOrderIterationResult(){
        return this.inOderIteration(this.root);
    }

    private List<Integer> inOderIteration(final BTNode root) {
        final List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        final Stack<BTNode> stack = new Stack<>();
        BTNode current = root;
        while(current!=null || !stack.empty()){
            while (current!=null){
                stack.push(current);
                current = current.getLeft();
            }
            //left
            current = stack.pop();
            result.add(current.getData());
            // parent
            if(!stack.isEmpty()){
                current = stack.pop();
                result.add(current.getData());
            }
            //right
            current = current.getRight();
        }
        return result;
    }

    // LDR -> Left Data Right
    private void inOrderRecursion(final  BTNode root, final List<Integer> result) {
        if(root!=null){
            inOrderRecursion(root.getLeft(), result);
            result.add(root.getData());
            inOrderRecursion(root.getRight(), result);
        }
    }

    public List<Integer> getElementsByPostOrder(){
        final List<Integer> result = new ArrayList<>();
        postOrderRecursion(this.root,result);
        return result;
    }

    // LRD -> Left Right Data
    private void postOrderRecursion(BTNode root, List<Integer> result) {
        if(root!=null){
            postOrderRecursion(root.getLeft(), result);
            postOrderRecursion(root.getRight(), result);
            result.add(root.getData());
        }
    }

    //DLR => Data Left Right
    public List<Integer> getElementsByPreOrder(){
        final List<Integer> result = new ArrayList<>();
        preOrderRecursion(this.root,result);
        return result;
    }

    private void preOrderRecursion(final BTNode root, final List<Integer> result) {
        if(root!=null){
            result.add(root.getData());
            preOrderRecursion(root.getLeft(), result);
            preOrderRecursion(root.getRight(), result);
        }
    }

    public List<Integer> getPreOrderIterationResult(){
        return preOrderIteration(this.root);
    }

    private List<Integer> preOrderIteration(final BTNode root) {
        final List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        final Stack<BTNode> stack = new Stack<>();
        BTNode current = root;
        while (current!=null || !stack.isEmpty()){

            while (current!=null){
                result.add(current.getData());
                // don't need to push the leaf nodes because we have already added to result
                if(current.getLeft() != null || current.getRight() != null){
                    stack.push(current);
                    current = current.getLeft();
                }else{
                    current = null;
                }
            }
            if(!stack.isEmpty()){
                current = stack.pop().getRight();
            }
        }
        return result;
    }

}
