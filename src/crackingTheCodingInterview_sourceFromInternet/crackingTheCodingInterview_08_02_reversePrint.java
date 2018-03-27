package crackingTheCodingInterview_sourceFromInternet;

public class crackingTheCodingInterview_08_02_reversePrint {
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
	
	public static void reversePrint(Node head) { 
		Node next;
		if(head == null ) {
			return;
		}
		reversePrint(head.next);
		System.out.print(head.data + " --> ");
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_reversePrint list = new crackingTheCodingInterview_08_02_reversePrint();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		reversePrint(list.head);
	}

}
