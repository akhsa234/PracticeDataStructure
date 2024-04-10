package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            node = first;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item){
        int index=0;
        var current = first;
        if(current != null){
             if(current.value == item) return index;
             else{
                 current = current.next;
                 index++;
             }
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first==last){
            first=last=null;
            return;
        }
        var second = first.next;
        first.next = null;
        first=second;
    }


    private class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
