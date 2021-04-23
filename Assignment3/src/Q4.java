import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=input.nextInt();
		
if (num>0) {
		do{
				int y=num%2;
				if((y==0) && (y!=num))
					{
						System.out.println(num);
					}
				num--;

		 }while(num>0);
	}
		input.close();
}}
