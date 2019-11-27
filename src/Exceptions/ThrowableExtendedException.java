package Exceptions;

public class ThrowableExtendedException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1964045619772684108L;

	public ThrowableExtendedException() {

	}

	public ThrowableExtendedException(String msg) {
		super(msg);
	}

	public ThrowableExtendedException(String msg,Throwable tr) {
		super(msg, tr);
	}

	public ThrowableExtendedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	@Override
	public String getLocalizedMessage() {
		
		return "This is a localized message";
	}
	@Override
	public String getMessage() {
		
		return "This is throwable extended exception";
	}
	@Override
	public synchronized Throwable getCause() {
		
		return new ArrayIndexOutOfBoundsException();
	}
	@Override
	public void printStackTrace() {
		
		super.printStackTrace();
	}
}
