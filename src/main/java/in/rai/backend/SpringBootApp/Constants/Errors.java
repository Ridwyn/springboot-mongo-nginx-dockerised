package in.rai.backend.SpringBootApp.Constants;

public enum Errors {

	ERR_000("ERR_000", "Server Error", "Internal Server Error"),
	
	BOOK_ERR_001("BOOK_ERR_001", "Book Not Found Error", "Book Was Not Found In The DataBase"),
	BOOK_ERR_002("BOOK_ERR_002", "No Data Found", "No Data Was Found In The DataBase"),
	BOOK_ERR_003("BOOK_ERR_003", "Empty List Error", "An Empty List is Sent as Input");
	
//	Supplier_ERR_001("Supplier_ERR_001", "Supplier Not Found", "No Data is found in the Supplier list");
	
	final String errorMessage;
	final String errorCode;
	final String errorDescription;
	
	Errors(String errorCode, String errorMessage, String description){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.errorDescription = description;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}
	
	
}
