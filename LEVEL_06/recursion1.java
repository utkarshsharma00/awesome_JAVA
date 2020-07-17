public class recursion1 {
	private static void toh(char s, char d, char h, int n){ // toh -> tower of hanoi
		if(n == 0){
			return;
		}
		
		toh(s, h, d, n - 1);
		System.out.println(n + "" + s + "" + d);
		toh(h, d, s, n - 1);
	}

	public static int factorial(int n){
		
	}
	
	public static int power(int x, int n){
		
	}
	
	public static void main(String[] args) {
		toh('s', 'd', 'h', 3);
		// pd(5);
//		pi(5);
//		pdis(5);
	}

	// pd(5) => 5 4 3 2 1
	// pd(4) => 4 3 2 1
	// pd(5) => 5 pd(4)
	private static void pd(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n);
		pd(n - 1);
	}

	// pi(5) => 1 2 3 4 5
	// pi(4) => 1 2 3 4
	// pi(5) => pi(4) 5
	private static void pi(int n) {
		if (n == 0) {
			return;
		}

		pi(n - 1);
		System.out.println(n);
	}

	// pdi(5) => 5 4 3 2 1 1 2 3 4 5
	// pdi(4) => 4 3 2 1 1 2 3 4
	// pdi(5) => 5 pdi(4) 5
	private static void pdi(int n) {
		if (n == 0) {
			return;
		}

		System.out.println(n + "a");
		pdi(n - 1);
		System.out.println(n + "b");
	}

	private static void pdis(int n) {
		if (n == 0) {
			return;
		}

		if (n % 2 == 1)
			System.out.println(n + "a");
		
		pdis(n - 1);

		if (n % 2 == 0)
			System.out.println(n + "b");
	}

	private static void pzz(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n + "a"); 
		
		pzz(n - 1);
		
		System.out.println(n + "b");
		
		pzz(n - 1);
		
		System.out.println(n + "c");
	}

	private static void pzzz(int n){
		if(n == 0){
			return;
		}
		
		System.out.println(n + "a");
		pzzz(n - 1);
		System.out.println(n + "b");
		pzzz(n - 1);
		System.out.println(n + "c");
		pzzz(n - 1);
		System.out.println(n + "d");
	}
}
