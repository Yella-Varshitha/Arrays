package com.kn.array;

import java.util.Scanner;

public class DoubleDemo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the double array size");
		
		double[] drr=new double[scan.nextInt()];
		//for(int i=0;i<drr.length;i++) {
		for(int i=0;i<drr.length;i++) {
			System.out.println( "Enter the double dataElements"+(i+1) + "=" );
			drr[i]=scan.nextDouble();
			
		}
		for(int i=0;i<drr.length;i++) {
			System.out.println((i+1) + "elements=" + drr[i] );
		}
		
	
		
		//print the two times of double values
		for(int i=0;i<drr.length;i++) {
			System.out.println((i+1) + "elements=" + drr[i]*2 );
		}
		
		scan.close();
		
	}

}
