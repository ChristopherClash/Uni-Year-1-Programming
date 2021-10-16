import java.util.NoSuchElementException;

/**
 * A class to implement a stack using linked lists
 * @param <T>
 */
public class StackLinkedList<T> {
    private Link<T> head, tail;
    private int stackLength;

    /**
     * initialises an empty list
     */
    public StackLinkedList() {
        head = tail = null;
        stackLength = 0;
    }

    /**
     * @return true if stack is empty
     */
    public boolean isEmpty(){
        return (head == null);
    }

    /**
     * method to remove the element at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public void pop() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T value = head.getElement();
        System.out.println("Removing '" + value + "' from the stack");
        head = head.getNext();
        stackLength = stackLength--;
    }

    /**
     * method to add a new element to the stack
     * @param item
     * @throws IllegalStateException if stack capacity reached
     * @throws NullPointerException if element being pushed onto stack is empty
     */
    public void push(T item) throws IllegalStateException, NullPointerException {
        if (item == null) {
            throw new NullPointerException("Element is empty");
        } else if (stackLength == 10) {
            throw new IllegalStateException("Stack capacity reached");
        } else {
            Link oldHead = head;
            head = new Link(item,null);
            head.setElement(item);
            head.setNext(oldHead);
            stackLength++;
        }
    }

    /**
     * method to view the element at the top of the stack, but not edit the stack
     * @return the element at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T peek() throws NoSuchElementException{
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        else {
            return head.getElement();
        }

    }
}
