package com.kvr.exceptions;

import java.io.FileNotFoundException;

public class SingleCharacterStringException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SingleCharacterStringException() {
	}
	
	public SingleCharacterStringException(String message) {
		super(message);
	}
	
	public SingleCharacterStringException(String msg,Throwable cause) {
		super(msg,cause);
	}
	
	public SingleCharacterStringException(String msg,Throwable cause,boolean suppressionenables,boolean writablestacktrace) {
		super(msg,cause,suppressionenables,writablestacktrace);
	}
}
