package linkedlists;

import java.util.ArrayList;

public class SinglyLinkedList {
	private Node head;
	private Node tail;
	private ArrayList<Node> list;
	private int size;
	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	public void addFirst(Node no) {
		if (list.isEmpty()){
			list.add(no);
			return;
		}
		head = no;
		list.get(0).setNext(no);
		list.add(0,no);
		size++;
	}
	public void removeFirst() {
		if(list.isEmpty()) {
			return;
		}
		head = head.getNext();
		size--;
	}
	public void addLast(Node n) {
		if (list.isEmpty()){
			list.add(n);
			return;
		}
		n.setNext(null);
		tail.setNext(n);
		tail = n;
		size++;
		
	}
	/**
	 * removes last element from list
	 * Uses O(n) time
	 */
	
	public void removeLast() {
		if(list.isEmpty()) {
			return;
		}
		for(Node i : list) {
			if(i.getNext() != null) {
				tail = i;
				tail.setNext(null);
				size--;
			}
		}
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

}
