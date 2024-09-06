package com.kn.array;

public class FindElement {

	public boolean isFindElement(int[] arr, int input) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==input) {
				return true;	
			}
		}
		return false;
	}
	

}
