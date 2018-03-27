import java.util.ArrayList;
import java.util.Collections;

public class crackingTheCodingInterview_08_01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		String str2 = "llhoo";
		if(isRearraySame(str1, str2)) {
			System.out.print("Y");
		}else {
			System.out.println("N");
		}
	}
	
	public static boolean isRearraySame(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		for(int i = 0; i < str1.length(); i++) {
			list1.add(str1);
		}
		for(int i = 0; i < str2.length(); i++) {
			list2.add(str2);
		}
		for (int j = 0; j < str1.length(); j++) {
			Collections.shuffle(list1);
			Collections.shuffle(list2);
			if( list1 == list2 ) {
				return true;
			}
		}
		
		/*if (str1.length() == str2.length()) {
			for(int i = 0; i < str1.length(); i++) {
				for(int j = 0; j < str2.length(); j++) {
					if(c1[i] == c2[j]) {
						return true;
					}
				}
			}
		}else {
			return false;
		} */
		return true;		
	}

}
