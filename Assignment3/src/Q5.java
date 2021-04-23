import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter x");
		int x=input.nextInt();
		System.out.println("Enter y");
		int y=input.nextInt();
		
		// Display the numbers between x and y including
		int i = x+1;
		int sum = 0;
		int counter=0;
		while (i < y) 
		{
			sum += i;
			counter=counter+1;
			i++;
		  }
					System.out.println("The average is:" + sum/counter);
			
input.close();

		
	

	}}
