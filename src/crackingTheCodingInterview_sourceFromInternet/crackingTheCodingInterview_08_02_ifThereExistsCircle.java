package crackingTheCodingInterview_sourceFromInternet;

public class crackingTheCodingInterview_08_02_ifThereExistsCircle {
	Node head;
	Node current;
	
	class Node {
		Node next;
		int data;
		
		public Node(int data){
			this.data = data;
		}
	}
	
	public void add(int data) {
		if(head == null) {
			head = new Node(data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	public void add(Node node) {
		if (node == null) return;
		if (head == null) {
			head = node;
			current = node;
		} else {
			current.next = node;
			current = current.next;
		}
	}
	
	public void print(Node node) {
		if (node == null) return;
		
		current = node;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
	}
	
	public boolean ifThereExistsCircle (Node head) {
		if (head == null) return false;
		Node first = head;
		Node second = head;
		while (second != null) {
			first = first.next;
			second = second.next.next;
			if(first == second) return true;
		}
				
		return false;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_ifThereExistsCircle list = new crackingTheCodingInterview_08_02_ifThereExistsCircle();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.add(list.head);
		list.print(list.head);
		System.out.println(list.ifThereExistsCircle(list.head));
	}

}
