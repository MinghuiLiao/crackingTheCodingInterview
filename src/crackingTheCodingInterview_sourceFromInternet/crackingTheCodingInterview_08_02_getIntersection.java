package crackingTheCodingInterview_sourceFromInternet;

//get the intersection point of two linked lists
public class crackingTheCodingInterview_08_02_getIntersection {
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
	
	public void print(Node node) {
		if (node == null) return;
		current = node;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static int getListLength (Node head) {
		int length = 0;
		Node current = head;
		if (head == null) return 0;

		while (current != null) {
			length++;
			current = current.next;		
		}
		return length;
	}

	
	public static Node getIntersection (Node head1, Node head2) {
		if (head1 == null || head2 == null) {
			return null;
		}
		int listLength1 = getListLength(head1);
		int listLength2 = getListLength(head2);
		
		int l = 0;
		
		
		if (listLength1 > listLength2) {
			l = listLength1 - listLength2;
			for (int i = 0; i < l; i++) {
				head1 = head1.next;
			}
		} else {
			l = listLength2 - listLength1;
			for (int i = 0; i < l; i++) {
				head2 = head2.next;
			}
		}
		
		while (head1 != null && head2 != null) {
			if (head1 == head2) {
				return head1;
			}
			
			head1 = head1.next;
			head2 = head2.next;	
		}
		return null;
	} 
	
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_getIntersection list1 = new crackingTheCodingInterview_08_02_getIntersection();
		crackingTheCodingInterview_08_02_getIntersection list2 = new crackingTheCodingInterview_08_02_getIntersection();

		for (int i = 1; i < 8; i++) {
			if (i < 4) {
				list1.add(i);
			} else if (3 < i && i < 6) {
				list2.add(i);
			} else {
				list1.add(i);
				list2.add(i);
			}
			
		}

		list1.print(list1.head);
		list2.print(list2.head);
		Node head1 = list1.head;
		Node head2 = list2.head;
		Node intersectionNode = getIntersection(head1, head2);
		int d = intersectionNode.data;
		System.out.println(d);
	}

}
