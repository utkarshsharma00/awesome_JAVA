import java.util.*

public class MatrixMultiplication {

	public static void main(String[] args) {
		int[][] one = {
				{10, 0, 0},
				{0, 10, 1}
		};
		
		int[][] two = {
				{1, 0, 1, 0},
				{0, 1, 1, 1},
				{1, 1, 1, 1}
		};
		
		int r1 = one.length;
		int c1 = one[0].length;
		int r2 = two.length;
		int c2 = two[0].length;
		
		if(c1 != r2){
			System.out.println("Invalid");
			return;
		}
		
		int[][] prd = new int[r1][c2];
		// calculate
		for(int i = 0; i < prd.length; i++){
			for(int j = 0; j < prd[0].length; j++){
				for(int k = 0; k < c1; k++){
					prd[i][j] = prd[i][j] + one[i][k] * two[k][j];
				}
			}
		}
		
		// print
		for(int i = 0; i < prd.length; i++){
			for(int j = 0; j < prd[0].length; j++){
				System.out.print(prd[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
