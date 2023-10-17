package com.problems;

import java.util.Stack;

/*
* Implement queue using stack
* need to implement queue functionality using stack ds
* insert - O(1)
* remove - O(N)
* */
public class QueueUsingStack {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStack(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //insert normal - O(1)
    public void insert(int item){
        s1.push(item);
    }

    //in queue pop should remove first one , so copyin from s1 to s2 and remove and transfer to s1
    public int remove(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int removed = s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return removed;
    }

    // to get the first value;
    public int peek(){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        int removed = s2.peek();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return removed;
    }
}
