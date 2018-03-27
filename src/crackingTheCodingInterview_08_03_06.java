import java.util.Stack;

//sort the stack where the largest item is on the top, 
//use no more than one extra stack to store temporary data
public class crackingTheCodingInterview_08_03_06 {
	public static Stack<Integer> sortStack(Stack<Integer> s) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!s.isEmpty()) {
			int temp = s.pop();
			while (!stack.isEmpty() && stack.peek() > temp) {
				s.push(stack.pop());
			}
			stack.push(temp);
		}
		return stack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
