


public class crackingTheCodingInterview_08_01_08 {

	public static void main(String[] args) {
		
	}
	
	public static boolean isTheSameString(String s1, String s2) {
		int length = s1.length();
		if(length == s2.length() && length >0) {
			String s1s1 = s1 + s1;
			return isSubstring(s1s1, s2);
		}
		return false;
	}

	private static boolean isSubstring(String s1, String s2) {
		return false;
	}
}
