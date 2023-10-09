package com.queue;



public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(5);
//        queue.insert(6);
//        queue.insert(2);
//        queue.insert(51);
//        queue.insert(8);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        queue.display();

        //circular queue
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(2);
        queue.insert(51);
        queue.insert(8);

        queue.display();
        System.out.println(queue.remove());
        queue.display();;
        queue.insert(133);
        queue.display();
    }


}
