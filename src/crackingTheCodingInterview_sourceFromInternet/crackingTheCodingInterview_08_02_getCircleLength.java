package crackingTheCodingInterview_sourceFromInternet;
//get the circle length
public class crackingTheCodingInterview_08_02_getCircleLength {
	Node head;
	Node current;
	
	class Node {
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void add(int data) {
		if (head == null) {
			head = new Node (data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	public void add(Node node) {
		if (node == null) {
			return;
		} 
		if (head == null) {
			head = node;
			current = node;
		} else {
			current.next = node;
			current = current.next;
		}
	}

	public void print(Node node) {
		current = node;
		if (node == null) {
			return;
		} 
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println();
		
	}
	public Node ifThereExistsCircle (Node head) {
		Node first = head;
		Node second = head;
		if (head == null) {
			return null;
		} 
		
		while (second != null) {
			first = first.next;
			second = second.next.next;
			if (first == second) {
				current = first;
				return current;
			}
		}
		return null;
	}
	
	public int getCircleLength (Node node) {
		int length = 0;
		Node current = node;
		if (head == null) {
			return 0;
		} 
		while (current != null) {
			current = current.next;
			length++;
			if (current == node) {
				return length;
			}
		}
		return length;
	}
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_getCircleLength list = new crackingTheCodingInterview_08_02_getCircleLength();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		list.add(list.head.next.next.next);
		//list.print(list.head);
		Node node = list.ifThereExistsCircle(list.head);
		System.out.print("The length of the circle is " + list.getCircleLength(node));

	}
}
