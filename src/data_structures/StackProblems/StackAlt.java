package data_structures.StackProblems;


/**
 * Implementing a stack using a fixed length array
 */
public class StackAlt {

    public static void main (String [] args){
        StackAlt stack = new StackAlt();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.print();

    }
    private int capacity = 1000;
    private int[] arr;
    private int top = -1;

    public StackAlt(){ arr = new int[capacity];}
    public StackAlt(int value){
        arr = new int[value];
        capacity = value;
    }

    public boolean isEmpty(){ return(top == -1);}
    public int size(){ return(top+1);}
    public void print(){}

    public void push(int value) throws IllegalStateException{
        if (size() == arr.length)
            throw new IllegalStateException("!!!!!! Stack overflow");
        top++;
        arr[top] = value;
    }
    public int pop(){
        if(isEmpty())
            throw new IllegalStateException("Error :Stack is Empty");
        int topElement = arr[top];
        top--;
        return topElement;
    }
    public int peek() throws IllegalStateException{
        if(isEmpty())
            throw new IllegalStateException("Error: Stack is empty");
        return arr[top];
    }
}

