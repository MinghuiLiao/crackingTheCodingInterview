package crackingTheCodingInterview_sourceFromInternet;
//get the length of a linked list
public class crackingTheCodingInterview_08_02_getLengthOfLinkedList { 
	Node head;
	Node current;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public void add(int data) {
		if (head == null) {
			head = new Node(data);
			current = head;
		} else {
			current.next = new Node(data);
			current = current.next;
		}
	}
	
	public static int getLength(Node head) {
		if(head == null) { //if there does not exist the LinkedList
			return 0;
		}
		int length = 0;
		Node current = head;
		while(current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_getLengthOfLinkedList list = new crackingTheCodingInterview_08_02_getLengthOfLinkedList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		System.out.println("The length of the linked list is " + getLength(list.head));

	}

}
