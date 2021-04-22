import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		   Scanner scan = new Scanner(System.in);
			System.out.print("Enter first number- ");
		int fn= scan.nextInt();
		System.out.print("Enter second number- ");
		int sn= scan.nextInt();
		int sum=fn+sn;
		int diff=fn-sn;
		int mul=fn*sn;
		int divn=fn/sn;
		int mod=fn%sn;

				System.out.println("The Sum of 125 and 24 is: " + sum);
				
				System.out.println("The Difference of 125 and 24 is: " + diff);
				System.out.println("The Multiplcation of 125 and 24 is: " + mul);
				System.out.println("The Division of 125 by 24 is: " + divn);
				System.out.println("The mode of 125 and 24 is: " + mod);

				scan.close();

	}

}
