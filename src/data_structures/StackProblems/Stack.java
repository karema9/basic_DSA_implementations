package data_structures.StackProblems;

/**
 *
 * @authors  Karema
 */
public interface Stack <Type>{

    /**
     * @return number of elements in the stack
     */
    int size();

    /**
     * Tests if the stack is empty;
     * @return true if stack is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Inserts an element item, to the top of the stack
     * @param item item to be inserted to the top of the stack
     */
    void push(Type item);

    /**
     * Returns, but does not remove the top element in the stack
     * @return the removed element, (return null if empty)
     */
    Type top();

    /**
     * Removes and returns the top element in the stack
     * @return removed element, return null if empty
     */
    Type pop();



}
