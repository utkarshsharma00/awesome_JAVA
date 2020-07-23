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
	
	private static int powerfakebtr(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xpn = 1;

		if (n % 2 == 0) {
			xpn = powerfakebtr(x, n / 2) * powerfakebtr(x, n / 2);
		} else {
			xpn = powerfakebtr(x, n / 2) * powerfakebtr(x, n / 2) * x;
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
	
	public static int max(int[] arr, int sp) {
		if (sp == arr.length) {
			return Integer.MIN_VALUE;
		}

		int misa = max(arr, sp + 1);
		if (misa > arr[sp]) {
			return misa;
		} else {
			return arr[sp];
		}
	}

	public static boolean findstupid(int[] arr, int sp, int data) {
		if (sp == arr.length) {
			return false;
		}

		boolean fisa = findstupid(arr, sp + 1, data);
		if (fisa == true) {
			return true;
		} else if (arr[sp] == data) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean findsmart(int[] arr, int sp, int data) {
		if (sp == arr.length) {
			return false;
		}

		if (arr[sp] == data) {
			return true;
		}

		boolean fisa = findsmart(arr, sp + 1, data);
		return fisa;
	}

	public static int fi(int[] arr, int sp, int data) {
		if (sp == arr.length) {
			return -1;
		}
		if (arr[sp] == data) {
			return sp;
		}

		int fiisa = fi(arr, sp + 1, data);
		return fiisa;
	}

	// li(arr, 0, 11) -> expected to return the last idx of 11 from 0 to end
	// li(arr, 1, 11) -> it will return the last idx of 11 from 1 to end
	public static int li(int[] arr, int sp, int data) {
		if (sp == arr.length) {
			return -1;
		}

		int liisa = li(arr, sp + 1, data);
		if (liisa != -1) {
			return liisa;
		} else if (arr[sp] == data) {
			return sp;
		} else {
			return -1;
		}
	}
	
	public static int[] allidces(int[] arr, int sp, int data, int csf) {
		if (sp == arr.length) {
			return new int[csf];
		}

		if (arr[sp] == data) {
			csf++;
		}

		int[] res = allidces(arr, sp + 1, data, csf);

		if (arr[sp] == data) {
			res[csf - 1] = sp;
		}
		
		return res;
	}
  
}
