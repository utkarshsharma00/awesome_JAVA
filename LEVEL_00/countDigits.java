public class countDigits 
{
	public static void main(String[] args) 
  {
		int num = 98123;
		
		while(num != 0)
    {
			int remainder = num % 10;
			System.out.print(remainder);
			num = num / 10;
		}
	}
}
