import java.util.Stack;
//write a class named MyQueue to use two stacks to complete a queue
public class crackingTheCodingInterview_08_03_05<T> {
	//public class MyQueue<T> {
		Stack<T> first, second;
		public crackingTheCodingInterview_08_03_05() {
			first = new Stack<T>();
			second = new Stack<T>();
		}
		
		public void enqueue(T value) {
			first.push(value);
		}
		
		public void transferStack() {
			if(second.isEmpty()) {
				while (!first.isEmpty()) {
					second.push(first.pop());
				}
			}
		}
		
		public T dequeue() {
			transferStack();
			return second.pop();
		}
		
		public T peek() {
			transferStack();
			return second.peek();
		}
	//}

	public static void main(String[] args) {
		crackingTheCodingInterview_08_03_05  q = new crackingTheCodingInterview_08_03_05 ();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		System.out.println(q.dequeue());
		q.enqueue(4);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}
