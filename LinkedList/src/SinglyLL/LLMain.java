package SinglyLL;

public class LLMain {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertFirst(2);
        l.insertFirst(3);
        l.insertLast(5);
        l.insert(6,2);
       // l.insert(7,0);
        l.display();
    }
}
