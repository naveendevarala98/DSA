package com.queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int end =0;
    int front =0;
    int size =0;//to count the size of array
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data=new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Circular queue is full");
            return false;
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("Circular queue is empty||");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Circular queue is empty||");
        }
        int i=front;
        do{
            System.out.print(data[i]+" <- ");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.println("end");
    }

    public boolean isFull(){
        return size==this.data.length;
    }
    private boolean isEmpty(){
        return size==0;
    }
}
