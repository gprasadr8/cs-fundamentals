package com.pw.trees.bt;

import java.util.*;

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

    public List<Integer> getPostOrderIterationResult(){
        List<Integer> result = new ArrayList<>();
        if(this.root == null){
            return result;
        }
        final Stack<BTNode> stack = new Stack<>();
        BTNode current = this.root;
        while(current !=null || !stack.isEmpty()){
            while (current!=null){
                if(current.getRight()!=null){
                    stack.push(current.getRight());
                }
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            //this will represent leaf node
            if(current.getRight() == null){
                result.add(current.getData());
                current = null;
            }else if(!stack.isEmpty() &&current.getRight() == stack.peek()){ //check if right subtree is already processed
                    BTNode tmp = current;
                    current = stack.pop();
                    stack.push(tmp);
            }else{ // left and right subtress both are processed now parent node to be processed.
                result.add(current.getData());
                current = null;
            }
        }
        return  result;
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

    public List<Integer> getPostOrderIterSimplifiedRes(){
        List<Integer> result = new ArrayList<>();
        if(this.root == null){
            return result;
        }
        Stack<BTNode> stack = new Stack<>();
        stack.push(this.root);
        BTNode prev = null;
        while (!stack.isEmpty()){
            BTNode current = stack.peek();
            if(prev ==null || prev.getLeft() == current || prev.getRight() == current){
                if(current.getLeft() != null){
                    stack.push(current.getLeft());
                }else if(current.getRight() != null){
                    stack.push(current.getRight());
                }
            }else if(current.getLeft() == prev){
                if(current.getRight() !=null){
                    stack.push(current.getRight());
                }
            }else{
                result.add(current.getData());
                stack.pop();
            }
            prev = current;
        }
        return result;
    }

    public List<Integer> getLevelOrderTraversalResult(){
        List<Integer> result = new ArrayList<>();
        if(this.root == null){
            return result;
        }

        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(this.root);
        queue.offer(null);
        while (!queue.isEmpty()){
            BTNode current = queue.poll();
            if(current!=null){
                result.add(current.getData());
                if(current.getLeft()!=null){
                    queue.offer(current.getLeft());
                }
                if(current.getRight()!=null){
                    queue.offer(current.getRight());
                }
            }else {
                //means for each level is differentiated with null element
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
            }
        }
        return  result;
    }

    public int height(BTNode root)
    {
        if (root == null)
            return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.getLeft());
            int rheight = height(root.getRight());

            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }
}
