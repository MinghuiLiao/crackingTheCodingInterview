package crackingTheCodingInterview_sourceFromInternet;

//reverse the linked list
public class crackingTheCodingInterview_08_02_reverseList { 
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
		if (node == null) return;
		current = node;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;					
		}
		System.out.println();
	} 
	
	public static Node reverseList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node current = head;
		Node next = null;
		Node reverseHead = null;
		
		while (current != null) {
			next = current.next; //record the next node of current node
			current.next = reverseHead; // current.next point to the head of the new list
			reverseHead = current;
			current = next; //move to the next node
		}
		return reverseHead;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_reverseList list = new crackingTheCodingInterview_08_02_reverseList();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.print("The linked list is ");
		list.print(list.head);
		System.out.print("The reversed list is ");
		list.print(reverseList(list.head));
	}

}
