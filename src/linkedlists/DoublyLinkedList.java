package linkedlists;

//import java.util.ArrayList;

/*
 * Creates empty Doubly linked list
 * Header and trailer are dummy elements which do not store any data
 */
public class DoublyLinkedList {
	private int size;
	private DNode header,trailer;
	public DoublyLinkedList() {
		size = 0;
		header = new DNode(null,null,trailer);
		trailer = new DNode(null,header,null);
	}
	public void addBetween(Object e,DNode p,DNode n) {
		DNode newe = new DNode(e,null,null);
		n.setPrev(newe);
		newe.setNext(n);
		p.setNext(newe);
		newe.setPrev(p);
		size++;
	}
	public void addFirst(Object e) {
		this.addBetween(e, header, header.getNext());
		size++;
	}
	public void addLast(Object e) {
		this.addBetween(e, trailer.getPrev(), trailer);
		size++;
	}
	/**
	 * removes first element from list
	 */
	public void removeFirst() {
		header = header.getNext();
		size--;
	}
	/**
	 * removes last element from list
	 * Uses O(1)
	 */
	public void removeLast() {
		trailer = trailer.getPrev();	//trailer.prev is the last node
		size--;
	}
	public void addBefore(Object e, DNode v) {
		this.addBetween(e, v.getPrev(), v);
		size++;
	}
	public void addAfter(Object e, DNode v) {
		this.addBetween(e, v, v.getNext());
		size++;
	}
	/**
	 * removes an element from a list
	 * @param v : pointer to a Node in a doubly linked list
	 * runs in O(1) time
	 */
	public void remove(DNode v) {
		DNode prev = v.getPrev();
		DNode next = v.getNext();
		prev.setNext(next);
		next.setPrev(prev);
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}

}
