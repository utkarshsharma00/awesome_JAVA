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
