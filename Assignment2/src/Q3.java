import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int num= scan.nextInt();

			if (num>0)
			{
				System.out.print("The number is positive");
				} else if(num<0)
			{
				System.out.print("The number is Negative");

			}else
				System.out.print("Unknown");
		scan.close();
		}
	}




