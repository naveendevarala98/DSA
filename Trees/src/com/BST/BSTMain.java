package com.BST;

public class BSTMain {
    public static void main(String[] args) {
//        int[] nums={5,4,6,7,3,8,2};
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.insertNum(nums);
//        bst.display();

        int[] sortedNums={1,2,3,4,5,6};
        BinarySearchTree bst = new BinarySearchTree();
        bst.sortedInsert(sortedNums);
        bst.display();

    }
}
