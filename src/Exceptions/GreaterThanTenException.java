package Exceptions;

public class GreaterThanTenException extends Exception {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8397991709557071488L;

	public GreaterThanTenException() {
	}

	public GreaterThanTenException(String message) {
		super(message);
	}

	public GreaterThanTenException(Throwable cause) {
		super(cause);
		
	}

	public GreaterThanTenException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public GreaterThanTenException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
