package queue;

public interface Queue {
	public int size();
	public boolean isEmpty();
	public Object first();
	public Object dequeue() throws QueueEmptyException;
	public void enqueue (Object obj) throws IllegalStateException;

}
