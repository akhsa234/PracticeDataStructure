package linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        var l1= new java.util.LinkedList<>();
        l1.removeFirst();
        var list= new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
       // list.removeFirst();
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(50));

    }
}
