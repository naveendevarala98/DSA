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

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return ;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node tmp = head;
        for(int i=1;i<index;i++){
            tmp = tmp.next;
        }
        Node p = new Node(val, tmp.next);
        tmp.next=p;


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
