
import java.util.Random;

public class crackingTheCodingInterview_08_01_07 {
	static Random ran = new Random();
	public static void main(String[] args) {
		int[][] m = new int[5][5];
		m = getRandom(m);
		ifZeroInMatrix(m);

	}
	
	public static int[][] getRandom(int[][] m) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				m[i][j] = ran.nextInt(10);
			}
		}
		System.out.println("The matrix is ");
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		return m;
	}
	
	public static void ifZeroInMatrix(int[][] m) { 
		int row = m.length;
		int col = m[0].length;
		boolean[] brow = new boolean[row];
		boolean[] bcol = new boolean[col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(m[i][j] == 0){
					brow[i] = true;
					bcol[j] = true;
					
				}				

			}
		}
			
			for (int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					if(brow[i]) {
						for(int k = 0; k < col; k++) {
							m[i][k] = 0;
						}
					}
					
					if(bcol[j]) {
						for(int e = 0; e < row; e++) {
							m[e][j] = 0;
						}
					}
				}
			}
			
		System.out.println("If there is zero in Matrix, the matrix is changed to ");
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println("");
		}
		
	}

}
