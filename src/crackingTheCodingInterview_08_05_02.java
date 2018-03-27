/**
 * Given a real number between 0 and 1 (e.g., 0.72) that is passed
 * in as a double, print the binary representation. If the number
 * cannot be represented accurately in binary with at most 32
 * characters, print "ERROR".
 */
public class crackingTheCodingInterview_08_05_02 {
	private String decimalToBinary(double n) {
		StringBuilder s = new StringBuilder();
		if (n >= 1 || n < 0) return "ERROR";
		s.append(".");
		
		
		while (n > 1) {
			if (s.length() >= 32) return "ERROR";
			double mul = n * 2;
			if (mul < 1) {
				s.append("0");
				n = mul;
			} else {
				s.append("1");
				n = mul - 1;
			}
		}
		return s.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
