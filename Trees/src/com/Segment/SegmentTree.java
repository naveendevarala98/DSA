package com.Segment;

public class SegmentTree {

    private static class Node{
        int val;
        int startInterval;
        int endInterval;

        Node left;
        Node right;

        int height;

        Node(int startInterval, int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }

    private Node root;
    public SegmentTree(int[] nums){
        this.root=constructTree(nums);
    }

    private Node constructTree(int[] nums){
        return constructTree(nums,0,nums.length-1);
    }

    private Node constructTree(int[] arr, int sI, int eI){
        if(sI==eI){
            Node leaf = new Node(sI,eI);
            leaf.val=arr[sI];
            return leaf;
        }

        Node n = new Node(sI,eI);
        int mid = (sI+eI)/2;
        n.left=constructTree(arr,sI,mid);
        n.right=constructTree(arr,mid+1,eI);

        n.val=n.left.val+n.right.val;
        return n;
    }

    public void display(){
        display(root);
    }

    private void display(Node node){
        String str="";
        //left data
        if(node.left!=null){
            str=str+"Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] " +
                    "and data: "+node.left.val+"=>";
        }else{
            str=str+"No left child";
        }
        //current node
        str=str+"Interval=["+node.startInterval+"-"+node.endInterval+"] " +
                "and data: "+node.val+"<=";

        //right data
        if(node.right!=null){
            str=str+"Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] " +
                    "and data: "+node.right.val+"=>";
        }else{
            str=str+"No right child";
        }

        System.out.println(str+'\n');

        if(node.left!=null) {
            display(node.left);
        }

        if(node.right!=null) {
            display(node.right);
        }
    }

    //search
    public int query(int qsi, int qei){
       return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei){
        //completely inside
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.val;
        }else if(node.startInterval>qei || node.endInterval<qsi){
            //completely outside
            return 0;
        }else{
            return query(node.left,qsi,qei)+query(node.right,qsi,qei);
        }
    }

    //update
    public int update(int index, int value){
        return update(root, index, value);
    }

    private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval||index==node.endInterval){
                node.val=value;
                return node.val;
            }else{
                int leftAns = update(node.left,index,value);
                int rightAns = update(node.right,index,value);
                node.val=leftAns+rightAns;
                return node.val;
            }
        }
        return node.val;
    }
}
