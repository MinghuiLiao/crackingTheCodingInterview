package crackingTheCodingInterview_sourceFromInternet;
//get the start point of a circle in a linked list
public class crackingTheCodingInterview_08_02_getStartOfCircle {
	Node head;
	Node current;
	
	class Node {
		Node next;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
	}
	
	public void add (int data) {
		if (head == null) {
			head = new Node (data);
			current = head;
		} else {
			current.next = new Node (data);
			current = current.next;
		}
	}
	
	public void add (Node node) {
		if (node == null) return;
		if (head == null) {
			head = node;
			current = node;
		} else {
			current.next = node;
			current = current.next;
		}
	} 
	
	public Node ifThereExistsCircle (Node head) {
		Node first = head;
		Node second = head;
		if (head == null) return null;
		while (second != null) {
			first = first.next;
			second = second.next.next;
			if (first == second) return first;
		}
		return null;
	}
	
	public int getCircleLength (Node node) {
		int length = 0;
		current = node;
		if (head == null) {
			return 0;
		}
		while (current != null) {
			current = current.next;
			length++;
			if (current == node) return length;
		}
		return length;
	}

	public Node getStartOfCircle (Node head, int circleLength) {
		if (head == null) return null;
		Node first = head;
		Node second = head;
		for (int i = 0; i < circleLength; i++) {
			second = second.next;
		}
		while (first != null && second != null) {
			first = first.next;
			second = second.next;
			if (first == second) {
				return first;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_getStartOfCircle list = new crackingTheCodingInterview_08_02_getStartOfCircle();
		Node c = null;
		for (int i = 0; i < 10; i++) {
			list.add(i);
			if (i == 3) {
				c = list.current;
			}
		}
		list.add(c);
		Node n = list.ifThereExistsCircle(list.head);
		int circleLength = list.getCircleLength(n);
		Node startNode = list.getStartOfCircle(list.head, circleLength);
		System.out.print(startNode.data);
	}

}
