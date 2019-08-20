package com.kvr.exceptions;

public class Inntertrycatch {

	public static void main(String[] args) {
		try {
			int a[] = new int[2];
			a[2] = 30;
			try {
				int b = 30/0;
			} catch(ArithmeticException e) {
				System.out.println("inside inner try");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inside inner try array index out of bounds");
			}
		} finally {
			
		}
	}

}
