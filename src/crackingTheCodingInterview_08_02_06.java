//find the start point from a circle linked list
public class crackingTheCodingInterview_08_02_06 {
	Node head;
	static Node current;
	
	public static class Node {
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
	
	public void print (Node node) {
		if (node == null) {
			return;
		}
		current = node;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println();
	} 
	
	public Node ifthereExistCircle (Node head) {
		Node first = head;
		Node second = head;
		if (head == null) return null;
		while (second != null) {
			first = first.next;
			second = second.next.next;
			if (first == second) {
				return first;
			}
		}
		return null;
	}
	
	public int getCirleListLength (Node node) {
		int length = 0;
		current = node;
		if (head == null) return 0;
		while (current != null) {
			current = current.next;
			length++;
			if (current == node) {
				return length;
			}
		}
		return length;
	}
	
	public Node getStartOfCircleList (Node head, int length) {
		if (head == null) return null;
		Node first = head;
		Node second = head;
		for (int i = 0; i < length; i++) {
			second = second.next;
		}
		
		while (first != null && second != null) {
			first = first.next;
			second = second.next;
			if (first == second) return first;
		}
		return null;
	}
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_06 list = new crackingTheCodingInterview_08_02_06();
		Node c = null;
		for (int i = 0; i < 10; i++) {
			list.add(i);
			if (i == 3) {
				c = crackingTheCodingInterview_08_02_06.current;
			}
		}
		//list.add(c);
		//System.out.print("The circle linked list is ");
		list.print(list.head);
		Node n = list.ifthereExistCircle(list.head);

		int length = list.getCirleListLength(n);
		
		Node startPoint = list.getStartOfCircleList(n, length);
		System.out.println("The start point of this circle linked list is " + startPoint.data);
	}

}
