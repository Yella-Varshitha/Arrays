package com.kn.array;

import java.util.Scanner;

public class THreeDimensionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the array Size=");
		int[][][] arr=new int[3][4][5];
		
	
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i].length;k++) {
					System.out.println("Enter the data elements=");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		

	}

}
