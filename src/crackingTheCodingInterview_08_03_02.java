import java.util.Stack;

//design a stack, include pop, push and min method which returns the minimum value of the stack
public class crackingTheCodingInterview_08_03_02 extends Stack<Integer>{
	Stack<Integer> s;
	public crackingTheCodingInterview_08_03_02() {
		s = new Stack<Integer>();
	}
	
	public int min() {
		if (s.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return s.peek();
		}
	}
	
	@Override
	public Integer pop() {
		int value = super.pop();
		if (value == min()) {
			s.pop();
		}
		return value;
	}
	
	public void push(int value) {
		if (value <= min()) {
			s.push(value);
		}
		super.push(value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
