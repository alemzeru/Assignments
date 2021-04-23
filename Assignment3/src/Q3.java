import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");

		Scanner scan= new Scanner(System.in);
		int day= scan.nextInt();

	switch (day) {
	  case 1:
	    System.out.println("You entered "+ day +" for Monday");
	    System.out.println("Monday is a weekday");

	    break;
	  case 2:
		System.out.println("You entered "+ day +" for Tuesday");
	    System.out.println("Tuesday is a weekday");

	    break;
	  case 3:
	    System.out.println("You entered "+ day +" for Wednesday");
	    System.out.println("Wednesday is a weekday");

	    break;
	  case 4:
	    System.out.println("You entered "+ day +" for Thursday");
	    System.out.println("Thursday is a weekday");

	    break;
	  case 5:
	    System.out.println("You entered "+ day +" for Friday");
	    System.out.println("Friday is a weekday");

	    break;
	  case 6:
	    System.out.println("You entered "+ day +" for Saturday");
	    System.out.println("Saturday is a weekend");

	    break;
	  case 7:
	    System.out.println("You entered "+ day +" for Sunday");
	    System.out.println("Sunday is a weekend");

	    break;
	    
	}

	scan.close();
}

}
