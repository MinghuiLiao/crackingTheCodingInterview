
public class crackingTheCodingInterview_08_01_01 {

	public static void main(String[] args) {
		String s = "Helo";
		if(isSame(s)) {
			System.out.println("N");
		}else {
			System.out.println("Y");
		}
	}
	
	public static boolean isSame (String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < c.length; j++) {
				if(s.charAt(i) == c[j] && i != j) {
					return false;
				}
			}			
		}
		return true;
	}

}
