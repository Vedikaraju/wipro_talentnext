package java_fundamentals;

public class Question22 {
	
	    public static void main(String[] args) {
	        int[] arr = {10, 25, 3, 78, 45};

	        int max = arr[0];
	        int min = arr[0];

	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	    }
	

}
