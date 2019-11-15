package feb19;

public class exitPoint {

	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 1, 0, 1, 0 }, { 1, 0, 1, 0 } };

		// 1, 3
		int d = 0; // d means direction and has been specified as (0 1 2 3 -> east south west
					     // north)
		int r = 0; // r means row
		int c = 0; // c means columns

		while (r >= 0 && r < arr.length && c >= 0 && c < arr[0].length) {
			d = (d + arr[r][c]) % 4;

			if (d == 0) {
				c++;
			} else if (d == 1) {
				r++;
			} else if (d == 2) {
				c--;
			} else if (d == 3) {
				r--;
			}
		}

		if (d == 0) {
			c--;
		} else if (d == 1) {
			r--;
		} else if (d == 2) {
			c++;
		} else if (d == 3) {
			r++;
		}

		System.out.println(r + " " + c);

	}

}
