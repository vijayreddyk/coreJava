package com.kvr.exceptions;

public class TestExceptions {
	public static void main(String[] args) {
		TestExceptions te = new TestExceptions();
		te.CheckString("h");
	}

	private void CheckString(String message) throws SingleCharacterStringException {
		if(message.length()==1) {
			throw new SingleCharacterStringException("Only single character found",new ArrayIndexOutOfBoundsException(),true,true);
		} else if(message.length() == 2) {
			throw new SingleCharacterStringException("String length is 2",new StringIndexOutOfBoundsException());
		}
	}
}
