package java_fundamentals;
import java.util.Scanner;
public class Question23 {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 34, 56, 7};
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number to search: ");
	        int search = sc.nextInt();

	        int index = -1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == search) {
	                index = i;
	                break;
	            }
	        }

	        System.out.println("Output: " + index);
	    }
	

}
