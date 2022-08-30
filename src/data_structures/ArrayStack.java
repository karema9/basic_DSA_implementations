package data_structures;

/**
 * An array based implementation of a stack
 * Emphasis on push and pop logic for the implementation of this class
 */
public class ArrayStack {
  private int[] arr;
  private int size;
  private int top = -1;

  public ArrayStack(int size){
      this.arr = new int[size];
      this.size = size;
      this.top = -1;
  }
   // Implement stack API

    public boolean isEmpty(){
      return top == -1;
    }
    /** Inserts element e to the top of the array */
    public void push(int e){
      arr[++top] = e;
    }
    /** Removes and returns the top element int the array */
    public int pop(){

      return arr[--top];
    }
    /** Returns the top element int the  array */
    public int peek(){
        return top;
    }

}
