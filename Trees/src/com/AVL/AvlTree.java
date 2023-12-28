package com.AVL;

public class AvlTree {

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

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public void insert(int val){
        root=  insert(root, val);
    }

    private Node insert(Node node, int val){
        if(node == null){
            Node n = new Node(val);
            return n;
        }

        if(val > node.val){
            node.right = insert(node.right,val);
        }
        if(val<node.val){
            node.left = insert(node.left,val);
        }

        node.height = Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left
                return rightRotate(node);
            }
            if(height(node.left.left)-height(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right-right
                return leftRotate(node);
            }
            if(height(node.right.left)-height(node.right.right)>0){
                //right-left
                node.right=rightRotate(node.right);
                //right-right
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return c;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right))+1;
        c.height=Math.max(height(c.left),height(c.right))+1;
        return p;
    }


    public void display(){
        display(root," root value is : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }
        System.out.println("heigh is:"+node.height+ details+node.val);
        display(node.left,"ieft of the "+node.val+" is:");
        display(node.right,"right of the "+node.val+" is:");
    }





}
