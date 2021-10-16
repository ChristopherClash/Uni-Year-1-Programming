
/**
 * 
 * A class that implements a queue.  It is your job to complete this class.  Your queue
 * will use a linked list constructed by QueueElements.  However, your queue must be general and allow
 * setting of any type of Object.  Also you cannot use ArrayLists or arrays (you will get zero).  
 * @author you
 *
 */


import java.util.NoSuchElementException;

public class Queue<T> {
	private QueueElement<T> head;
	private QueueElement<T> tail;

	/**
	 * Constructs an empty Queue.
	 */
	public Queue() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Returns true if the queue is empty
	 */
	public boolean isEmpty() {
	    return (this.head == null && this.tail == null);
	}

	/**
	 * Returns the element at the head of the queue
	 */
	public T peek() throws NoSuchElementException {
		if (isEmpty() || head == null){
			throw new NoSuchElementException("Queue is empty");
		} else {
			QueueElement<T> current = head;
			return current.getElement();
		}
	}
	
	/**
	 * Removes the front element of the queue
	 */
	public void dequeue() throws NoSuchElementException {
		if (isEmpty()){
			throw new NoSuchElementException("Queue is empty");
		}
		if (head.getNext() == null){
			tail = null;
		}
		head = head.getNext();
	}
	
	/**
	 * Puts an element on the back of the queue.
	 */
	public void enqueue(T e) {
		QueueElement<T> temp = new QueueElement<>(e, null);
	    if (isEmpty()){
	    	temp.setNext(head);
	    	head = temp;
	    	tail = temp;
		} else {
			tail.setNext(temp);
			tail = temp;
			tail.setNext(null);
		}
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 */
	public void print() {
	   QueueElement<T> current = head;
	   while (current != null){
	   	System.out.println(current.getElement());
	   	current = current.getNext();
	   }

	}
}
