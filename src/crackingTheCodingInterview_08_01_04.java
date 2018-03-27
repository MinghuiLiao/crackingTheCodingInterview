import java.util.Scanner;

public class crackingTheCodingInterview_08_01_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//String s = input.nextLine();
		String s = "Mr John Smith";	
		String s1 = replaceStr(s);
		System.out.println(s1);		
	}
	
	public static String replaceStr(String s) { 
		StringBuffer strB = new StringBuffer(s); 
		int length = strB.length();
		int count = 0;
		for(int i = 0; i < strB.length(); i++) {						
			System.out.println(length);			
			if(strB.charAt(i) == ' ') {
				count++;
			}
		}
		int newLength = length + count * 2;
		System.out.println(newLength);
		strB.setLength(newLength);
		
		for(int i = 0; i < strB.length(); i++) {
			if(strB.charAt(i) == ' ') {
				strB.insert(i, '%');
				strB.insert(i+1, '2');
				strB.insert(i+2, '0');
			} else {
				strB.setCharAt(i, strB.charAt(i));
			}
		}

		return strB.toString();
	}
	
}
