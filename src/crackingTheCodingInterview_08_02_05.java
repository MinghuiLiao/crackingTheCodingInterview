//use two linked lists to store integer, each node contain a digit. write codes to calculate the sum of these two integers
public class crackingTheCodingInterview_08_02_05 {
	Node head;
	static Node current;
	
	public static class Node{
		Node next;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		void appendToTail (int data) {
			Node end = new Node (data);
			Node n = this;
			
			if (n == null) return;
			
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
		
		void print(Node node) {
			if (node == null) return;
			current = node;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println();
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
	
	public Node sumOfLists (Node head1, Node head2) {
		Node sum = null;		
		int d = 0; 
		int y = 0;
		Node node = null;
		while (head2 != null) {							
			d = head1.data + head2.data;	
			d = d + y;
			y = d / 10;
			if (d >= 10) {
				d = d % 10;						
				sum = new Node(d);
				head1 = head1.next;
				head2 = head2.next;
				if (node == null) {
					node = new Node(d);
				} else {
					Node current = node;
					while(current.next != null) {
						current = current.next;
					}
					current.next = sum;
				}
				
			} else {
				sum = new Node(d);				
				head1 = head1.next;
				head2 = head2.next;
				if (node == null) {
					node = new Node(d);
				} else {
					Node current = node;
					while(current.next != null) {
						current = current.next;
					}
					current.next = sum;
				}
			}
			
		}
		return node;
	}
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_05 list = new crackingTheCodingInterview_08_02_05();
		Node node1 = new Node(7);
		node1.appendToTail(1);
		node1.appendToTail(6);
		node1.print(node1);
		Node node2 = new Node(5);
		node2.appendToTail(9);
		node2.appendToTail(2);
		node2.print(node2);
		Node sum = list.sumOfLists(node1, node2);
		list.print(sum);
	}

}
