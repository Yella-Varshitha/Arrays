package com.kn.array;

import java.util.Scanner;



public class ArrayUsingCharacterElements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Size of the array=");
		char[] crr=new char[scan.next().charAt(0)];
		for(int i=0;i<crr.length;i++) {
			System.out.println("Enter the array of data elements" + (i+1)+"="+crr[i]);
			
		}
		for(int i=0;i<crr.length;i++) {
			System.out.println( (i+1)+"="+crr[i]);
			
		}
		
	}

}
