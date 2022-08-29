package in.rai.backend.SpringBootApp.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import in.rai.backend.SpringBootApp.Constants.Errors;
import in.rai.backend.SpringBootApp.exceptions.BookException;
import in.rai.backend.SpringBootApp.exceptions.GenericException;
import in.rai.backend.SpringBootApp.model.ExceptionResponse;

public class ControllerAdvice {
	@ExceptionHandler(value = {BookException.class})
	public ResponseEntity<ExceptionResponse> handleBookException(BookException exception, WebRequest webRequest) {
		
		ExceptionResponse response = new ExceptionResponse();
		
		response.setDateTime(LocalDateTime.now());
		response.setErrorCode(exception.getErrorCode());
		response.setErrorMessage(exception.getErrorMessage());
		response.setErrorDescription(exception.getErrorDescription());
		
		return new ResponseEntity<> (response, HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(value = {SupplierException.class})
//	public ResponseEntity<ExceptionResponse> handleBookException(SupplierException exception, WebRequest webRequest) {
//		
//		ExceptionRespose response = new ExceptionResponse();
//		
//		response.setDateTime(LocalDateTime.now());
//		response.setErrorCode(exception.getErrorCode());
//		response.setErrorMessage(exception.getErrorMessage());
//		response.setErrorDescription(exception.getErrorDescription());
//		
//		return new ResponseEntity<> (response, HttpStatus.NOT_FOUND);
//	}
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<ExceptionResponse> handleBookException(Exception exception, WebRequest webRequest) {
		
		ExceptionResponse response = new ExceptionResponse();
		GenericException genericException = new GenericException(Errors.ERR_000);
		
		response.setDateTime(LocalDateTime.now());
		response.setErrorCode(genericException.getErrorCode());
		response.setErrorMessage(genericException.getErrorMessage());
		response.setErrorDescription(genericException.getErrorDescription());
		
		exception.printStackTrace();
		
		return new ResponseEntity<> (response, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
