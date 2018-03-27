

public class crackingTheCodingInterview_08_01_05 {

	public static void main(String[] args) {
		String s = "aabcccccaaa"; 
		char[] c = s.toCharArray(); 		
		int[] count = countDuplicateLetter(c);
		
		for(int i = 0; i < count.length; i++) {						
			if(count[i] != 0) {
				System.out.print((char)(i+'a'));
				System.out.print(count[i]);
			}
			
		}
	}
	
	public static int[] countDuplicateLetter(char[] c) {
		int[] counts = new int[26];
		for(int i = 0; i < c.length; i++) {
			counts[c[i]-'a'] ++;
		}
		return counts;
	}

}
