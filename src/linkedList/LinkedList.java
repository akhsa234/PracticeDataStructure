package linkedList;

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

    private class Node {

        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
