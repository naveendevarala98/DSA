package com.queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE=10;

    int end =0;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data=new int[size];
    }

    //Time comp - O(1)
    public boolean insert(int item){
        if(isFull()){
            System.out.println("queue is full");
            return false;
        }
        data[end++]=item;
        return true;
    }

    //Time comp - O(N)
    public int remove(){
        if(isEmpty()){

        }

        int removed = data[0];

        //shift elements
        for(int i=1;i<data.length;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" <- ");
        }
        System.out.println("end");
    }

    public boolean isFull(){
        return end==this.data.length;
    }
    private boolean isEmpty(){
        return end==0;
    }


}
