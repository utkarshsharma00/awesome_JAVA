import java.util.*

public class lof3 {

	public static void main(String[] args) {
		int a = 30;
		int b = 10;
		int c = 20;

		if (a >= b && a >= c) 
		{
			System.out.println(a);
		} 
		else 
		{
			if (b >= c) 
			{
				System.out.println(b);
			} 
			else 
			{
				System.out.println(c);
			}
		}
	}

}
