package data_structures.StackProblems;

public class StackGeneric<Type> implements Stack<Type> {
    private Type[] arr;
    private int t = -1;
    public static int CAPACITY = 1000;

    public StackGeneric() {this(CAPACITY);}
    public StackGeneric (int capacity){
        arr = (Type[]) new Object[capacity];
    }

    @Override
    public boolean isEmpty() {
        return (t == -1);
    }

    @Override
    public int size() {
        return (t+1);
    }

    @Override
    public void push(Type item) throws IllegalStateException{
        if (size() == arr.length) throw new IllegalStateException("Stack Overflow");
        t++;
        arr[t] = item;

    }

    @Override
    public Type pop() {
        if (isEmpty()) return null;
        Type answer = arr[t];
        arr[t] = null;
        t--;
        return answer;

    }
    @Override
    public Type top() {
        if (isEmpty()) return null;
        return arr[t];
    }

    public static void main (String [] args){
        StackGeneric<Integer> stack = new StackGeneric<>();
        stack.push(10);
        System.out.println(stack.size());
        stack.push(67);
        System.out.println(stack.size());
        int num = stack.pop();
        System.out.println(num);
    }
}
