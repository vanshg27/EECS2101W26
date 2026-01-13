package linkedlists;

public class Node {
	private Object element;
	private Node next;
	public Node() {
		element = null;
		next = null;
	}
	public Node(Object element, Node node) {
		this.element = element;
		this.next = node;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node node) {
		this.next = node;
	}
	
}
