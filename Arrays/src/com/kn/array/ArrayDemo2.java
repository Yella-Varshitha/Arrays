package com.kn.array;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the float array =");
		float[] frr=new float[scan.nextInt()];
		for(int i=0;i<frr.length;i++) {
			System.out.println("Enter the float array Elements" + (i+1) + "=");
			frr[i]=scan.nextFloat();
			
		}
				
		System.out.println("Array intialisation");
		//for(int i=0;i<frr.length;i++) {
		//	System.out.println((i+1) + " element=" + frr[i]);
		//}
		int count=1;
		for(float f : frr) {
			System.out.println(count++ + "element=" + f);
		}
		scan.close();
	}
}

