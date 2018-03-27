import java.util.Scanner;

//find the last K node from the linked list
public class crackingTheCodingInterview_08_02_02 {
	Node head;
	static Node current;
	public static class Node {
		Node next;
		int data;
		
		public Node (int data) {
			this.data = data;
		}
		
		void appendToTail (int data) {
			Node end = new Node (data);
			Node n = this;
			while (n.next != null) {
				n = n.next;
			}
			n.next = end;
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

	public Node findLastKNode (Node head, int k) {
		Node first = head;
		Node second = head;
		for (int i = 0; i < k; i++) {
			second = second.next;
		}
		while (second != null) {
			first = first.next;
			second = second.next;
		}
		return first;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		crackingTheCodingInterview_08_02_02 list = new crackingTheCodingInterview_08_02_02();
		Node node = new Node(0);
		for (int i = 1; i < 10; i++) {
			node.appendToTail(i);
		}
		System.out.print("The linked list is ");
		node.print(node);
		System.out.print("Please input the sequence number of the node to find the last K node from the linked list: ");
		int k = input.nextInt();
		Node n = list.findLastKNode(node, k);
		System.out.print(n.data);
	}

}
