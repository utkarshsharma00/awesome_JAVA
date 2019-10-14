import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		int principal = 1000;
		int rate = 10;
		int time = 2;
		int simple_interest = principal * rate * time / 100;
		System.out.println("Simple Interes is " + simple_interest);
	}
}
