package linkedlists;

public class DNode {
	private Object element;
	private DNode prev;
	private DNode next;
	public DNode() {
		this(null,null,null);
	}
	public DNode(Object obj, DNode prev, DNode next) {
		super();
		this.element = obj;
		this.prev = prev;
		this.next = next;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object obj) {
		this.element = obj;
	}
	public DNode getPrev() {
		return prev;
	}
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	

}
