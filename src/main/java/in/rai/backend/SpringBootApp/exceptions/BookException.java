package in.rai.backend.SpringBootApp.exceptions;

import in.rai.backend.SpringBootApp.Constants.Errors;

public class BookException extends RuntimeException{
	
private static final long serialVersionUID = 1L;
	
	final String errorCode;
	final String errorMessage;
	final String errorDescription;
	
	public BookException(Errors bookErr) {
		super();
		this.errorCode = bookErr.getErrorCode();
		this.errorMessage = bookErr.getErrorMessage();
		this.errorDescription = bookErr.getErrorDescription();
	}

	public String getErrorCode() {
		return errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
}
