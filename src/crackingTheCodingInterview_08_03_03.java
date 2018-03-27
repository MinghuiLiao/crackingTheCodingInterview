import java.util.ArrayList;
import java.util.List;
//write a method SetOfStacks which consists of more than one stacks, 
//when a stack is full, a new stack will be created
public class crackingTheCodingInterview_08_03_03 {
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
	
	public class SetOfStacks {
		ArrayList<Stack> stacks = new ArrayList<Stack>();
		int capacity;
		public SetOfStacks(int capacity) {
			this.capacity = capacity;
		}
		
		Stack getLastStack() {
			if (stacks.size() == 0) return null;
			return stacks.get(stacks.size() - 1);
		}
		
		int pop() {
			Stack last = getLastStack();
			int v = last.pop();
			if (((List<Stack>) last).size() == 0) stacks.remove(stacks.size() - 1);			
			return v;
		}
		
		void push(int v) {
			Stack last = getLastStack();
			if (last != null && !last.isFull()) {
				last.push(v);
			} else {
				Stack stack = new Stack(capacity);
				stack.push(v);
				stacks.add(stack);
			}
			
		}
		
		public class Stack {
			private int capacity;
			Node top;
			Node next;

			int size = 0;

			public Stack(int capacity) {
				this.capacity = capacity;
			}
			
			public boolean isFull() {
				return capacity == size;
			}

			public void join(Node above, Node below) {
				if (below != null) below.next = above;
				if (above != null) above.next = below;
			}
			
			public int pop() {
				Node t = top;
				top = top.next;
				size--;
				return t.data;
			}
			
			public boolean push (int v) {
				if (size >= capacity) return false;
				size++;
				Node n = new Node(v);
				if (size == 1) next = n;
				join(n, top);
				top = n;
				return true;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
