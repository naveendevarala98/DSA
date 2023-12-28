package com.AVL;

public class AvlMain {
    public static void main(String[] args){
        AvlTree avl = new AvlTree();
       // int[] nums={4,3,5,7,8,9};
        int[] nums={10,20,30,40,50,25};
        for(int i=0;i<nums.length;i++){
            avl.insert(nums[i]);
        }

        avl.display();

    }
}
