package com.BT;

import java.util.Scanner;


public class BinaryTree {

    private Node root;
    public void insert(Scanner scanner){
        System.out.println("Enter root node value ");
        int val = scanner.nextInt();
         root = new Node(val);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to inster val to the left of this node "+node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to insert left of this node "+node.val);
            int val = scanner.nextInt();
            node.left= new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to inster val to the right of this node "+node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to insert right of this node "+node.val);
            int val = scanner.nextInt();
            node.right= new Node(val);
            populate(scanner, node.right);
        }
    }

    public void display(){

        display(this.root,"");
    }

    private void display(Node node, String indent){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay(){
        prettyDisplay(this.root,0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>"+node.val);
        }else{
            System.out.println(node.val);
        }

        prettyDisplay(node.left,level+1);

    }
    private static class  Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }
}
