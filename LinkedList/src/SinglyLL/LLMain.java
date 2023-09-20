package SinglyLL;

public class LLMain {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertLast(5);
        l.insertLast(8);
        l.insertLast(9);
        l.insert(6,2);
        l.display();
        System.out.println("delete first val "+l.deleteFirst());
        l.display();
       System.out.println("delete last val "+l.deleteLast());
        l.display();
        System.out.println("delete val "+l.delete(2));
        l.display();
    }
}
