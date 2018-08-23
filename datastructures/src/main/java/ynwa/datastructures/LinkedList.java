package ynwa.datastructures;

public class LinkedList<T> {
	T value;
	LinkedList<T> previous;
	LinkedList<T> next;
	
	public LinkedList(T value) {
		this.value = value;
	}

	public void add(T item) {
		if (this.value == null) {
			this.value = item;
			return;
		}
		
		LinkedList<T> nextItem = this.next;
		LinkedList<T> currentItem = this;
		while (nextItem != null) {
			currentItem = nextItem;
			nextItem = nextItem.next;
		}
		
		currentItem.next = new LinkedList<T>(item);
		currentItem.next.previous = currentItem;
	}
	
	public LinkedList<T> addToRoot(T item) {
		LinkedList<T> newRoot = new LinkedList<T>(item);
		newRoot.next = this;
		newRoot.previous = null;
		return newRoot;
	}
	
	public void delete(T item) {
		System.out.println("deleting:" + item);
		LinkedList<T> current = this;
		
		if (this.value.equals(item)) {
			this.value = this.next != null ? this.next.value : null;
			this.next = this.next != null ? this.next.next : null;
			
			return;
		}
		
		while (current != null) {
			if (current.value.equals(item)) {
				if (current.previous != null) {
					current.previous.next = current.next;
				}
				
				if (current.next != null) {
					current.next.previous = current.previous;
				}
				
				return;
			}
			current = current.next;
		}
	}
	
	public void printList() {
		LinkedList<T> current = this;
		while (current != null) {
			System.out.print(current.value);
			System.out.print("->");
			current = current.next;
		}
		System.out.println("null");
	}
}
