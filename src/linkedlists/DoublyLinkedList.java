package linkedlists;

import java.util.ArrayList;

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
	public void removeFirst() {
		header = header.getNext();
		size--;
	}
	public void removeLast() {
		trailer = trailer.getPrev();
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
