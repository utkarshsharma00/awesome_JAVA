import java.util.Scanner;

public class pat2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number ");
		int n = scn.nextInt();
		
		int var = 1;
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(var + "\t");
				var++;
			}
			System.out.println();
		}
	}

}
