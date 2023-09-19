package SinglyLL;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        if(tail == null){
            tail = head;
        }
        size+=1;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    /*
    * Node structure consist of val and next node
    * */
    private  class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

        Node (int val, Node next){
            this.val=val;
            this.next = next;
        }
    }
}
