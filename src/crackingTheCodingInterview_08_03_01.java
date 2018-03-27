//use an array to complete three stacks
public class crackingTheCodingInterview_08_03_01 {
	public static class ArrayStack {
		int size = 100;
		int[] stack = new int[size * 3];
		int[] pointer = {-1, -1, -1};
		
		int indexOfTop (int stackNum) {
			return stackNum * size + pointer[stackNum];
		}
		
		int pop(int stackNum) throws Exception {
			if (pointer[stackNum] == -1) {
				throw new Exception("Tring to pop an empty stack.");
			}
			int item = stack[indexOfTop(stackNum)];
			stack[indexOfTop(stackNum)] = 0;
			pointer[stackNum]--;
			return item;
		}
		
		void push (int stackNum, int item) throws Exception {
			if (stack[indexOfTop(stackNum)] +1 > size) {
				throw new Exception("There is no space for push into the stack");
			}
			
			pointer[stackNum]++;
			stack[indexOfTop(stackNum)] = item;
		}
		
		int peek(int stackNum) {
			return stack[indexOfTop(stackNum)];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
