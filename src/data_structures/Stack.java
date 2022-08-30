package data_structures;

/**
 * An implementation of a stack according to the Last In First Out principple
 * NOTE: This is a very simple implementation of a stack
 * Error handling is not implemented
 * Practise this before a more comprehensive implementation
 */

public class Stack {
    public static class Node {
        private int data;
        private Node next;

        private Node (int data){
            this.data = data;
        }
    }
    // end of the node class

    private Node top;


    /** Returns true if stack is empty **/
    public boolean isEmpty() {
        return top == null;
    }
    /** Returns the top element in the stack **/
    public int peek () {
        return top.data;
    }
    /** Inserts element e  at the top of the stack **/
    public void push(int data) {
        Node node = new Node( data);
        node.next = top;
        top = node;
    }
    /**Removes the top element int the stack **/
    public int pop() {
        int data = top.data;
        top = top.next;
        return data;
    }

}
