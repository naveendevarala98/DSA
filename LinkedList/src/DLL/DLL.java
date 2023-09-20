package DLL;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){ // if its first element
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node tmp =head;
        while(tmp != null){
            System.out.print(tmp.val+" -> ");
            tmp = tmp.next;
        }
        System.out.println("END");

    }

    private class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }

        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
