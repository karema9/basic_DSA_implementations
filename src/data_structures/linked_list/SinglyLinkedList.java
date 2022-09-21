package data_structures.linked_list;

public class SinglyLinkedList<T> {
    private static class Node<T> {
        private T element;
        private Node<T> next;

        public Node (T data, Node<T> n){
            element = data;
            next = n;
        }

        public T getElement() { return element; }
        public Node<T> getNode() { return next;}
        public void setNext(Node<T> next){
            this.next = next;
        }
    }
    // ----------- end of the nested node class -----------
    // Instance variables of the Singly Linked List class

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public SinglyLinkedList() { }

    // accessor methods
    public boolean isEmpty() { return size == 0;}
    public int size() { return size; }
    public T first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    public T last(){
        if (isEmpty()) return null;
        return tail.getElement();
    }


    // mutator methods,think of dictionary operations, insertion, deletion and traversal
    public void addFirst(T item){
        head = new Node<>(item , head);
        if ( size == 0)
            tail = head;
        size ++;
    }

    public void addLast (T item){
        Node<T> newest = new Node<>(item, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public T removeFirst() {
        if (isEmpty()) return null;
        T answer = head.getElement();
        head = head.getNode();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }


}
