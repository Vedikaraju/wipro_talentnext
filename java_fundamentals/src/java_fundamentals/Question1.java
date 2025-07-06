package java_fundamentals;
import java.util.Scanner;

public class Question1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user to enter a name
	        System.out.println();
	        String name1 = scanner.nextLine();
	        System.out.println();
	        String name2 = scanner.nextLine();
	        // Print the welcome message
	        System.out.println(name1 +" Technologies " + name2);

	        scanner.close();
	    }
	}
