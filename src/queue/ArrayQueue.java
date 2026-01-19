package queue;
/**
 * This is an Array based implementation of a queue
 * Queues follows the First-in-first out (FIFO) principle 
 * where elements are inserted at the rear of the queue
 * elements are removed from the front of the queue
 * All methods run in O(1) time
 */
public abstract class ArrayQueue implements Queue{
	private int N; //Max size of Array
	private Object[] Q = new Object[N];
	private int sz = 0;
	private int f = -1; //index of first element
	
	public int size() {
		return sz;
	}
	public ArrayQueue() {
		
	}
	public boolean isEmpty() {
		if (N==0) {
			return true;
		}
		return false;
	}
	/**
	 * Pushes element to the rear of a queue
	 */
	public void enqueue(Object v) {           
		if (this.size() == N) {throw new IllegalStateException();}
		else {
			int avail = (f+sz)%N;	//next available spot in queue
			Q[avail] = v;
			sz++;
		}
		
	}
	/**
	 * Remove element from the front
	 */
	public Object dequeue() {
		Object temp = Q[f];
		f = (f+1)% N; //equivalent to if(f<14){return f++;} else{f=0}
		sz--;
		return temp;
		
	}
	
	
	

}
