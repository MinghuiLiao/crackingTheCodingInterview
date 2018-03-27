package crackingTheCodingInterview_sourceFromInternet;
//Combine two sorted linked lists, after combination, the list is also sorted

public class crackingTheCodingInterview_08_02_combineTwoSortedList {
	Node head;
	Node current;
	
	public class Node {
		Node next;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		public void applendedToTail(int data) {
			Node end = new Node(data); 
			Node current = this;
			while(current.next != null) {
				current = current.next;
			}
			current.next = end;
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
	
	public void print(Node node) {
		if(node == null) {
			return;
		} 
		
		current = node;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		
		System.out.println();
		
	}
	
	public Node combineTwoSortedList (Node head1, Node head2) {
		Node head; //head for new Linked List
		Node current;
		if (head1 == null && head2 == null) return null;
		if (head1 == null) return head2; 
		if (head2 == null) return head1;
		
		//find the smaller node between head1 and head2, then current becomes the smaller node 
		if (head1.data < head2.data) {  
			head = head1;
			current = head1;
			head1 = head1.next;
		} else {
			head = head2;
			current = head2;
			head2 = head2.next;
		} 
		
		//In new list, the next node of the current node to be the smaller node of the two linked lists
		while (head1 != null && head2 != null) {
			if (head1.data < head2.data) {
				current.next = head1;
				current = current.next;
				head1 = head1.next;
			} else {
				current.next = head2;
				current = current.next;
				head2 = head2.next;
			}
		}
		
		//combine the remaining nodes
		if (head1 !=null) {
			current.next = head1;
		} 
		if (head2 != null) {
			current.next = head2;
		}
		
		return head;
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_combineTwoSortedList list1 = new crackingTheCodingInterview_08_02_combineTwoSortedList(); 
		crackingTheCodingInterview_08_02_combineTwoSortedList list2 = new crackingTheCodingInterview_08_02_combineTwoSortedList();
		System.out.println("The two linked lists are: ");
		for (int i = 0; i < 5; i++) {
			list1.add(i);
		} 
		
		list1.print(list1.head);
		for (int i = 3; i < 9; i++) {
			list2.add(i);
		}
		list2.print(list2.head);
		crackingTheCodingInterview_08_02_combineTwoSortedList list3 = new crackingTheCodingInterview_08_02_combineTwoSortedList();
		list3.head = list3.combineTwoSortedList(list1.head, list2.head);
		System.out.print ("The merged linked list is ");
		list3.print(list3.head);
	}

}
