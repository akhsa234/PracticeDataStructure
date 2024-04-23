package linkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            node = first;
        }
        size++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        if (current != null) {
            if (current.value == item) return index;
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;

    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (first == last) {
            first = last = null;
        } else {
            var previous = getPreviousNode(last);
            last = previous;
            previous.next = null;
        }
        size--;
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void reverse() {
        if (isEmpty()) return;
        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }

//    public Object[] toArray() {
//    }

    public int getKthFromEnd(int k) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        var a = first;
        var b = first;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null) throw new IllegalArgumentException();
        }
            while (b != last) {
                a = a.next;
                b = b.next;
            }
        return a.value;
    }

    private class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
