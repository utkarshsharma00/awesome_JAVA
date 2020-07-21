public class recursion2 {

	public static void main(String[] args) {

		// System.out.println(factorial(5));
		// System.out.println(power(3, 4));
		// System.out.println(powerbtr(3, 4));
		int[] arr = { 2, 11, 3, 11, 11, 9, 7, 4, 10 };
		// display(arr, 0);
		//System.out.println(fi(arr, 0, 11));
    
		int[] res = allidces(arr, 0, 11, 0);
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}
	}
	
	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		int fnm1 = factorial(n - 1);
		int fn = n * fnm1;
		return fn;
	}

	private static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnm1 = power(x, n - 1);
		int xpn = xpnm1 * x;
		return xpn;
	}

	private static int powerbtr(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpnb2 = powerbtr(x, n / 2);
		int xpn = 1;

		if (n % 2 == 0) {
			xpn = xpnb2 * xpnb2;
		} else {
			xpn = xpnb2 * xpnb2 * x;
		}

		return xpn;
	}
  
  	public static void display(int[] arr, int sp) {
		if (sp == arr.length) {
			return;
		}

		System.out.println(arr[sp]);
		display(arr, sp + 1); //
	}

	public static void displayr(int[] arr, int sp) {
		if (sp == arr.length) {
			return;
		}

		displayr(arr, sp + 1);
		System.out.println(arr[sp]);
	}
  
}
