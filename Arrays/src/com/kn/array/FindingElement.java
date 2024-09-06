package com.kn.array;

import java.util.Scanner;

public class FindingElement {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the arary=");
	int[] arr = new int[(scan.nextInt())];
	for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the array elements" +(i+1) +"=");
		arr[i]=scan.nextInt();
}
	
	
for(int i=0;i<arr.length;i++) {
		
		System.out.println("Enter the array elements" +(i+1)+"="+ arr[i]);
	
}
System.out.print("[");
for(int i=0;i<arr.length;i++) {
	
		System.out.print( arr[i]+",");
	}
System.out.println("]");

System.out.print("Enter the arrey element found=");
int input=scan.nextInt();
FindElement findElement=new FindElement();
boolean result=findElement.isFindElement(arr,input);
if(result) {
	System.out.println("value is found");
}
else {
	System.out.println("value is not found");
}



}
}



