package data_structures;

/**
 * Implementation of the queue data structure
 *
 * GUIDELINES
 * 1. define a node class
 * 2. define tail and head elements
 * 3. define methods supported by the queue class
 *
 *  NOTICE: Focus on the element to be added  or removed
 *  elements are inserted to the tail
 *  elements are removed from the head
 */

public class Queue {
    // Driver code
    public static void main(String [] args){
        // write test cases class  here
    }
   public static class Node {
       private int data;
       private Node next;

       private Node(int data){this.data = data;}
   }

   // end of node class
   private Node head;
   private Node tail;

   private void add(int data){
       /**
        * inserts element to the tail of the array
        */
       Node node  = new  Node(data);
       if (tail != null)
           tail.next = node;
       tail = node;
       if (head == null)
           head = node;
   }

   private int remove() {
       /**
        * Removes and returns the element at the head of the queue
        */
       // get the head to point to the next element in the array
       int data = head.data;
       head = head.next;
       if (head == null)
           tail = null;
       return data;
   }

   private boolean isEmpty(){
       /**
        * Returns true if the queue is empty
        */
       return head == null;
   }
    private int peek(){
        /**
         * Returns element at the head of the array i.e. the first element
         */
        return head.data;
    }
}
