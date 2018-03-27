//Remove duplicated nodes in unsorted list
public class crackingTheCodingInterview_08_02_01 {
	Node head;
	Node current;

	public static class Node {
		Node next;
		int data;

		public Node(int data) {
			this.data = data;
		}

		void appendToTail(int data) {
			Node end = new Node(data);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
		}
	}

	public void print(Node node) {
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

	public static void deleteDuplicateNode(Node head) {
		Node first = head;
		Node second;
		if (head == null)
			return;
		while (first != null) {
			second = first;
			while (second.next != null) {
				if (second.next.data == first.data) {
					second.next = second.next.next;
				} else {
					second = second.next;
				}
			}
			first = first.next;
		}
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_01 list = new crackingTheCodingInterview_08_02_01();
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
		list.print(node);
		System.out.print("Delete the duplicate node from the list: ");
		deleteDuplicateNode(node);
		list.print(node);
	}

}
