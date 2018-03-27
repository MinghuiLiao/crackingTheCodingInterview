package crackingTheCodingInterview_sourceFromInternet;
// find the middle node of a Linked List
public class crackingTheCodingInterview_08_02_findMidNode { 
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
			head = new Node(data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	public void print (Node node) {
		if (node == null) {
			return;
		}
		current = node;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	} 
	
	public static Node findMidNode (Node head) {
		Node first = head;
		Node second = head;
		if (head == null) {
			return null;
		}
		
		while (second != null && second.next != null) {
			first = first.next;
			second = second.next.next;
		}
		return first;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_findMidNode list = new crackingTheCodingInterview_08_02_findMidNode(); 
		for (int i = 0; i < 10; i ++) {
			list.add(i);
		}
		System.out.println("The Linked List is ");
		list.print(list.head);
		Node midNode = findMidNode(list.head);
		System.out.println("The middle node of this linked list is " + midNode.data);
	}

}
