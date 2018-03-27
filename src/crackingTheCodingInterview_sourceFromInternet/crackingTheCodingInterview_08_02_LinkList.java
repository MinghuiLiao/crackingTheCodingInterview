package crackingTheCodingInterview_sourceFromInternet;
//Creating a Linked List and traversal all the nodes
public class crackingTheCodingInterview_08_02_LinkList {
	public Node node;
	public Node head;
	public Node current;
	
	class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	//add data in the linked list
	public void add(int data) {
		if(head == null) {
			head = new Node(data); 
			current = head;
		} else {
			current.next = new Node(data); 
			current = current.next;
		}
	}
	
	//print the linked list
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
	
	//test 
	public static void main(String[] args) {
		crackingTheCodingInterview_08_02_LinkList list = new crackingTheCodingInterview_08_02_LinkList();
		for (int i = 0; i < 10; i++) {
			list.add(i); //add data in the linked list
		}
		
		list.print(list.head); //traversal the nodes from the head
	}

}
