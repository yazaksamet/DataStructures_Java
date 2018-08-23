package ynwa.datastructures;

public class App {

	public static void main(String[] args) {
		TestLinkedList();
	}
	
	public static void TestLinkedList() {
		LinkedList<Integer> linked = new LinkedList<Integer>(0);
		linked.add(1);
		linked.add(2);
		linked.add(3);
		linked.add(4);
		linked.printList();
		
		linked.delete(3);
		linked.printList();
		linked.delete(4);
		linked.printList();
		linked.delete(0);
		linked.printList();
		
		linked.delete(5);
		linked.printList();
		
		linked.delete(1);
		linked.printList();
		
		linked.delete(2);
		linked.printList();
		
		linked.add(7);
		linked.printList();
		
		linked.add(8);
		linked.printList();
		
		linked.delete(7);
		linked.printList();
	}
	
	public static void TestQueue() {
		Queue<Integer> queueInstance = new Queue<Integer>();
		System.out.println(queueInstance.isEmpty());
		
		queueInstance.add(1);
		queueInstance.add(2);
		queueInstance.add(3);
		queueInstance.add(4);
		
		int dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		queueInstance.add(6);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		System.out.println(queueInstance.peek());
		System.out.println(queueInstance.isEmpty());
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		System.out.println(queueInstance.isEmpty());
		
		queueInstance.add(10);
		queueInstance.add(11);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		queueInstance.add(12);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
		
		dequeue = queueInstance.remove();
		System.out.println(dequeue);
	}
	
	public static void TestStack() {
		Stack<Integer> stackInstance = new Stack<Integer>();
		stackInstance.push(1);
		stackInstance.push(2);
		stackInstance.push(3);
		stackInstance.push(4);
		
		int pop = stackInstance.pop();
		System.out.println(pop);
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		System.out.println(stackInstance.isEmpty());
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		stackInstance.push(10);
		stackInstance.push(12);
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		stackInstance.push(14);
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		pop = stackInstance.pop();
		System.out.println(pop);
		
		System.out.println(stackInstance.isEmpty());
		
		pop = stackInstance.pop();
		System.out.println(pop);
	}
}
