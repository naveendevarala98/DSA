package com.stack;

public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE=10;

    int ptr =-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack full cannot push");
            return false;
        }
        ptr++;
        this.data[ptr]=item;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empy!!");
        }
        return this.data[ptr--];
    }

    public boolean isFull(){
        return ptr==this.data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }
}
