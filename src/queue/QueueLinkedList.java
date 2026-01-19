package queue;
import linkedlists.Node;
//import linkedlists.SinglyLinkedList;
/**
 * To implement a Queue using a Singly linked list
 * where tail of the linked list = rear of the queue (enqueue)
 * head of the linked list = front of the queue (dequeue)
 */
public abstract class QueueLinkedList implements Queue{
	//private SinglyLinkedList q = new SinglyLinkedList();
	private Node head;
	private Node tail;
	private int size;
	/**
	 * Using enqueue to add object to the rear of queue
	 * @param Accepts object
	 * sets object into node and sets next pointer of the node to null
	 * node to be inserted to the rear of the queue if queue is not empty
	 * if queue is empty element is made the head
	 */
	public void enqueue(Object o) {
		Node n = new Node();
		n.setElement(o);
		n.setNext(null);
		if(size==0) {
			head = n;
			size++;
		}
		else {
			tail.setNext(n);
			tail = n;
			size++;
		}}
	/**
	 * Using dequeue to remove object from the front of the queue
	 * @return returns object from the head of the linked list
	 * using temp variable to store element the pbject before returning it
	 */
	public Object dequeue() throws QueueEmptyException {
		if(size==0) {
			return new QueueEmptyException();
		}
		Object temp = head.getElement();
		head = head.getNext();
		size--;
		return temp;
	}
		
		
		
	}

