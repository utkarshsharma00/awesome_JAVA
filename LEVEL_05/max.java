import java.util.*

public class max {

	public static void main(String[] args) {
		int[] arr = { 55, 2, 33, 11, 77, 6 };
		// find max and print
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

}
