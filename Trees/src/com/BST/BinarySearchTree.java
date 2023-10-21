package com.BST;

public class BinarySearchTree {
    private static class Node{
        int val;
        Node left;
        Node right;
        int height;

        Node(int val){
            this.val=val;
        }
    }

    private Node root;

    private int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }
    public void insertNum(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    private Node insert(int val){
        root = populate(this.root, val);
        return root;
    }

    private Node populate(Node node, int val){
        if(node == null){
            Node n = new Node(val);
            return n;
        }
        if(val<node.val){
            node.left=populate(node.left,val);
        }
        if(val>node.val){
            node.right=populate(node.right,val);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;

        return node;
    }

    public void sortedInsert(int[] nums){
        sortedPopulate(nums, 0, nums.length);
    }

    private  void sortedPopulate(int[] nums, int start, int end){
        if(start>=end){
            return;
        }

        int mid = (start+end)/2;
        this.insert(mid);
        this.sortedPopulate(nums,start,mid);
        this.sortedPopulate(nums,mid+1,end);
    }

    public void display(){
        display(root, " Root Node: ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println("height : "+node.height+details+node.val);
        display(node.left," Left Node of "+node.val+" : ");
        display(node.right," right Node of "+node.val+" : ");
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println("Node value: "+node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        System.out.println("Node value: "+node.val);
        preOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println("Node value: "+node.val);
    }




}
