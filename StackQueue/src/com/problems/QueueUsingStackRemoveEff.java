package com.problems;

import java.util.Stack;

/*
* Implement queue using stack
* need to implement queue functionality using stack ds
* insert - O(N)
* remove - O(1)
* */
public class QueueUsingStackRemoveEff {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStackRemoveEff(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //insert normal - O(N)
    public void insert(int item){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
         s2.push(item);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove(){
        return s1.pop();
    }

    // to get the first value;
    public int peek(){

        return s1.peek();
    }
}
