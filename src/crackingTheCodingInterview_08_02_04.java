//give a value x as a standard to divide the linked list. If nodes are smaller than x, then the nodes are sorted before the nodes larger than x
public class crackingTheCodingInterview_08_02_04 {
	static Node current;
	Node head;
	public static class Node {
		Node next;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		void appendToTail (int data) {
			Node end = new Node (data);
			Node node = this;

			while (node.next != null) {
				node = node.next;
			}
			node.next = end;
		}
		
		void print (Node node) {
			if (node == null) return;
			current = node;
			while (current != null) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public Node sortedListAccordingToX (Node node, int x) {
		Node headOfList = null;
		Node tailOfList = null;
		while (node != null) {
			Node next = node.next;
			if (node.data < x) {
				node.next = headOfList;
				headOfList = node;
			} else {
				node.next = tailOfList;
				tailOfList = node;
			}
			node = next;			
		}
				
		if (headOfList == null) {
			System.out.print("tailOfList: " + tailOfList.data + " --> ");
			return tailOfList;			
		}
		
		Node head = headOfList;
		while (headOfList.next != null) {
			headOfList = headOfList.next;			
		}
		headOfList.next = tailOfList;
		return head;
	}
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_04 list = new crackingTheCodingInterview_08_02_04();
		Node node = new Node(3);
		node.appendToTail(0);
		node.appendToTail(2);
		node.appendToTail(2);
		node.appendToTail(7);
		node.appendToTail(9);
		node.appendToTail(5);
		node.appendToTail(1);
		node.appendToTail(6);
		node.appendToTail(6);
		node.appendToTail(2);
		System.out.print("The linked list is ");
		node.print(node);
		Node n = list.sortedListAccordingToX (node, 3);
		node.print(n);
	}

}
