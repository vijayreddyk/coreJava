package com.kvr.exceptions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SuppressedExceptions {
	/*The equals method implements an equivalence relation on non-null object references:
		It is reflexive: for any non-null reference value x, x.equals(x) should return true.
		It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
		It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
		It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
		For any non-null reference value x, x.equals(null) should return false.
		The equals method for class Object implements the most discriminating possible equivalence relation on objects; that is, for any non-null reference values x and y, this method returns true if and only if x and y refer to the same object (x == y has the value true).
		Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.
    */
	public static void main(String[] args) {
		try {
			SuppressedExceptions se = new SuppressedExceptions();
			String newMessage = se.testMethodR("hel");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds");
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Strig index out of bounds");
			e.printStackTrace();
		} catch(Exception e) {
			
		} 
	}
	public  String testMethodR(String msg) throws ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException{
		int a[] = new int[2];
		List<Throwable> allExceptions = new ArrayList<>();
		try {
			a[2] = 4;
		} catch (ArrayIndexOutOfBoundsException e) {
			allExceptions.add(e);
			try {
				a[3] = 5;
			} catch (ArrayIndexOutOfBoundsException e1) {
				allExceptions.add(e1);
			}
		} finally {
			try {
				char b = msg.charAt(3);
			} catch (StringIndexOutOfBoundsException e) {
				for(Throwable t:allExceptions) {
					e.addSuppressed(t);
				}
				throw e;
			}
		}
		return msg;
	}

}
