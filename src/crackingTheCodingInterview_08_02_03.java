
//delete the middle node of the linked list
public class crackingTheCodingInterview_08_02_03 {
	Node head;
	static Node current;
	public static class Node {
		Node next;
		int data;
		public Node (int data) {
			this.data = data;
		}
		
		void appendToTail (int data) {
			Node end = new Node(data);
			Node n = this;
			
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
	
	public static Node findMidNode (Node head) {
		Node first = head;
		Node second = head;
		if (head == null) {
			return null;
		}
		while (second != null  && second.next != null) {
			first = first.next;
			second = second.next.next;
		}
		return first;
	}
	
	public void deleteMidNode (Node node) {
		if (node == null || node.next == null) return;
		Node next = node.next;
		node.data = next.data;
		node.next = next.next;
	}
	
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_03 list = new crackingTheCodingInterview_08_02_03();
		Node node = new Node(1);
		for (int i = 2; i < 6; i++) {
			node.appendToTail(i);
		}
		node.print(node);
		Node midNode = findMidNode(node);
		System.out.println(midNode.data);
		list.deleteMidNode(midNode);
		node.print(node);
	}

}
