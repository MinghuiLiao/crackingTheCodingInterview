import java.util.Stack;

//hanoi tower, use stack to move the disks from first column to the last column
public class crackingTheCodingInterview_08_03_04 {
	//public class hanoiTower {
		private Stack<Integer> disks;
		private int index;
		
		public crackingTheCodingInterview_08_03_04(int i) {
			disks = new Stack<Integer>();
			index = i;
		}

		public int index() {
			return index;
		}
		
		public void add(int d) {
			if (!disks.isEmpty() && disks.peek() <= d) {
				System.out.println("Error placing disk " + d);
			} else {
				disks.push(d);
			}
		}
		
		public void move(crackingTheCodingInterview_08_03_04 t) {
			int top = disks.pop();
			t.add(top);
			System.out.println("Move disk " + top + " from " + index() + " to " + t.index());
		}
		
		public void moveDisks(int n, crackingTheCodingInterview_08_03_04 destination, crackingTheCodingInterview_08_03_04 transfer) {
			if (n > 0) {
				moveDisks(n - 1, transfer, destination); // move n - 1 disks from origin to transfer point
				move(destination); // move the top disk to destination
				moveDisks(n-1, destination, this); // move n - 1 disks from transfer point to destination
			}
		//}
	}

	public static void main(String[] args) {
		int n = 5; 
		crackingTheCodingInterview_08_03_04[] towers = new crackingTheCodingInterview_08_03_04[n];
		for (int i = 0; i < 3; i++) {
			towers[i] = new crackingTheCodingInterview_08_03_04(i);
		}
		
		for (int i = n - 1; i >= 0; i--) {
			towers[0].add(i);
		}
		towers[0].moveDisks(n, towers[2], towers[1]);
	}
}
