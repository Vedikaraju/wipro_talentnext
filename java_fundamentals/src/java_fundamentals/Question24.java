package java_fundamentals;
import java.util.Arrays;

public class Question24 {
	public static int[] evenOdd(int[] arr) {
		int[] result=new int[arr.length];
		int evenIndex=0;
		int oddIndex=arr.length-1;
		for(int num:arr) {
			if(num%2==0) {
				result[evenIndex++]=num;
			}else {
				result[oddIndex--]=num;
			}
		}return result;
	}
	public static void main(String[]args) {
		int[]arr1= {1,0,1,0,1,0,1,1};
		int[]arr2= {3,3,2};
		int[]arr3= {2,2,2};
		System.out.println(Arrays.toString(evenOdd(arr1)));
		System.out.println(Arrays.toString(evenOdd(arr2)));
		System.out.println(Arrays.toString(evenOdd(arr3)));
		
	}

}
