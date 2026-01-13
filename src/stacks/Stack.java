package stacks;

public interface Stack {
	public int size();
	public boolean isEmpty();
	public Object top() throws EmptyStackException;
	public void push(Object o) throws FullStackException;
	public Object pop() throws EmptyStackException;

}
