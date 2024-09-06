package TwoDimensionalArray;

import java.util.Scanner;

public class TwoDimensionalArrayDemo {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the size of the array=");
	int [] arr =new int[scan.nextInt()];
	System.out.println(">>>>>>>>>>> Array Starts Here<<<<<<<<<<");
	for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the array elements" +(i+1) +"=");
		arr[i]=scan.nextInt();
	}
for(int i=0;i<arr.length;i++) {
		
		System.out.println(arr[i]);
		
	}
}
}
