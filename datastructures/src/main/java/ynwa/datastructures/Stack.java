package ynwa.datastructures;

public class Stack<T> {
	public class StackPointer {
		T value;
		StackPointer previous;
	}
	
	private StackPointer root;
	
	public void push(T item) {
		StackPointer stackItem = new StackPointer();
		stackItem.value = item;
		stackItem.previous = root;
		root = stackItem;
	}
	
	public T pop() {
		if (root == null) {
			throw new StackOverflowError();
		}
		
		T currentValue = root.value;
		root = root.previous;
		return currentValue;
	}
	
	public T peek() {
		if (root == null) {
			throw new StackOverflowError();
		}
		
		return root.value;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
}
