package stacks;

public abstract class ArrayStack implements Stack {
	//holds the stack elements
	private Object S[];
	//index to top element
	private int t = -1;
	int N = 0;	//Max size of Stack
	//constructor
	public ArrayStack(int capacity) {
		S = new Object[capacity];
		t += capacity; //update top element index
	}
	/**
	 * @return returns the size of a stack
	 */
	public int size() {
		return t+1;
	}
	/**
	 * @return returns a boolean value indicating if the stack is empty or not
	 */
	public boolean isEmpty() {
		if(t==-1) {
			return true;
		}
		return false;
	}
	/**
	 * @return returns the top  element in the stack
	 */
	public Object top() {
		return S[t];
	}
	/**
	 * One of the fundamental functions of a stack
	 * @return returns and removes the top element from a stack
	 */
	public Object pop() {
		if(this.isEmpty()) {return null;}
		Object temp = this.top();
		S[t] = null;	//for optimization
		t = t-1;	//decrement t to allow Garbage collector to claim prev top element
		return temp;
	}
	/**
	 * Implementing Stack without temp element
	 * @return returns and removes the top element
	 */
	public Object pop2() {
		if(this.isEmpty()) {return null;}
		t--; //decrement t first 
		return S[t];
	}
	/**
	 * Push method for an array based stack
	 * @throws FullStackException
	 * Limitation of Array based implementation
	 * Solution: Extend the stack
	 * @returns void
	 */
	public void push(Object o) throws FullStackException{
		if(size() == N) {throw new FullStackException();}
		t = t+1;
		S[t] = o;
	}
}