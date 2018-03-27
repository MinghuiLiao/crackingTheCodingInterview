package crackingTheCodingInterview_sourceFromInternet;

import java.util.Scanner;

import crackingTheCodingInterview_sourceFromInternet.crackingTheCodingInterview_08_02_LinkList.Node;
//find the last K node of a linked list
public class crackingTheCodingInterview_08_02_findLastKNode { 
	Node head;
	Node current;
	
	class Node {
		int data;
		Node next;
		
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
	
	public static Node findLastKNode(Node head, int index) {
		Node first = head;
		Node second = head;
		
		if(head == null || index == 0) {
			return null;
		}
		
		for (int i = 0; i < index-1; i++) {
			second = second.next;
			if (second == null) {
				return null;
			}
		}
		
		while (second.next != null) {
			first = first.next;
			second = second.next;
		}
		
		return first;
	}
	
	public void print(Node node) {
		if(node == null) {
			return;
		} 
		
		current = node;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
	}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_findLastKNode list = new crackingTheCodingInterview_08_02_findLastKNode();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the index for counting the last nodes in the linked list: ");
		int index = input.nextInt();
		Node k = findLastKNode(list.head,  index);
		String r;
		switch (index) {
		case 1: r = "st"; break;
		case 2: r = "nd"; break;
		case 3: r = "rd"; break;
		default: r = "th";
		}
		System.out.println("The last " + index + r + " node is " + k.data);

	}

}
