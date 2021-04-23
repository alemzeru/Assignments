import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);
		   System.out.print("Enter first number- ");
			
		int n1= scan.nextInt();
		System.out.print("Enter second number- ");
		int n2= scan.nextInt();
		int sum=n1+n2;
		int diff=n1-n2;
		
		System.out.println("The Sum of first and second number is: " + sum);
		System.out.println("The Difference between First and second number is:" + diff);
		scan.close();
	}

}
