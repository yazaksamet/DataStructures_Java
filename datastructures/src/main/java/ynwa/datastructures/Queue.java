package ynwa.datastructures;

public class Queue<T> {
	public class QueuePointer {
		T value;
		QueuePointer next;
	}
	
	private QueuePointer root;
	private QueuePointer tail;
	
	public void add(T item) {
		QueuePointer queueItem = new QueuePointer();
		queueItem.value = item;
		
		if (root != null) {
			root.next = queueItem;
		}
		
		if (tail == null) {
			tail = queueItem;
		}
		
		root = queueItem;
	}
	
	public T remove() {
		if (tail == null) {
			throw new NullPointerException();
		}
		
		T currentValue = tail.value;
		tail = tail.next;
		
		if (tail == null) {
			root = null;
		}
		
		return currentValue;
	}
	
	public T peek() {
		if (tail == null) {
			throw new NullPointerException();
		}
		
		return tail.value;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
}
