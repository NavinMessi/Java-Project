package com.exception;

public class ArrayIndexOutof_Exception {
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[6]);
		
	}

}
