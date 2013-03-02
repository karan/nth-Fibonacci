import java.util.Scanner;

/*
 * The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n-1) + F(n-2) 
 * when n>1;. Given a positive integer 'n', print out the F(n). 

 */
public class fibonacci {

	/**
	 * @author Karan Goel
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n: ");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;

		for(int i = 0; i <= n; i++) {
			num1 += num2;
			num2 = num1 - num2;
		}
		System.out.println("F(" + n + ") = " + num2);
	}
}