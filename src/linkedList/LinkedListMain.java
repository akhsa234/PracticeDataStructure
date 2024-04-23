package linkedList;

import java.util.Arrays;

public class LinkedListMain {
    public static void main(String[] args) {
        var l1= new java.util.LinkedList<>();
       // l1.removeFirst();
        var list= new LinkedList();
        System.out.println(list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.size());
        list.addLast(40);
        list.reverse();
     //   Object[] array = list.toArray();
      //  list.removeFirst();
        System.out.println(list.size()+"list.size()");
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(50));
      //  System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromEnd(1));

    }
}
