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
        node.next=head;//link already first(head) node to new first node
        head=node; // new node is head now
        if(tail == null){ // if only one is present then head and tail should be same
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
        Node p = new Node(val, tmp.next); // new node links to right part
        tmp.next=p; // left side to map with new node
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <=1){
           return deleteFirst();
        }

        Node secondLast = get(size-2);//to get second last
        int val = tail.val; //tail value which is going to delete
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
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
