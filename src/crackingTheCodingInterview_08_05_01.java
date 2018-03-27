//You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a method to set all bits between i and j in N equal to M (e.g., M becomes a substring of N located at i and starting at j). 
//EXAMPLE:
//Input: N = 10000000000, M = 10101, i = 2, j = 6
//Output: N = 10001010100
public class crackingTheCodingInterview_08_05_01 {
	private int clearBits(int n, int i, int j) {
		int ones = ~0;
		int j0 = ones << (j + 1);
		int i0 = (1 << i) - 1;
		int mask = j0 | i0;
		int clearZero = n & mask;
		return clearZero;
	}
	
	private int insertIntIntoInt(int N, int M, int i, int j) {
		int moveM = M << i;
		return clearBits(N, i, j) | moveM;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
