package com.Segment;

public class SegmentMain {

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree st = new SegmentTree(arr);
       // st.display();
        System.out.println(st.query(1, 6));


    }
}
