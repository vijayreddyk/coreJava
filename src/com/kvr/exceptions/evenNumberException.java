package com.kvr.exceptions;

public class evenNumberException extends Exception {

	public evenNumberException() {
		
	}

	public evenNumberException(int number) {
		if(number%2 == 0) {
			System.out.println("Even number");
		}
	}

	public evenNumberException(Throwable cause) {
		super(cause);
		
	}

	public evenNumberException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public evenNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
