import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age>=18)
        {
        // Displaying the number 
        System.out.print("You are eligible to vote: " );
        }
        else
        {
            System.out.print("You are not eligible to vote " );

        }
        input.close();

	}

}
