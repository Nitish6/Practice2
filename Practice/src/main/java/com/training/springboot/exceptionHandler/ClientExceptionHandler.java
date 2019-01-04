package com.training.springboot.exceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.training.validator.ApiFieldError;

@ControllerAdvice
public class ClientExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex,
			HttpHeaders headers, 
			HttpStatus status,
			WebRequest request
			) {
		BindingResult bindingResult = ex
				.getBindingResult();

		List<ApiFieldError> apiFieldErrors = bindingResult
				.getFieldErrors()
				.stream()
				.map(fieldError -> new ApiFieldError(
						fieldError.getField(),
						fieldError.getRejectedValue(),
						fieldError.getDefaultMessage())
						)
				.collect(Collectors.toList());

		/*	List<ApiGlobalError> apiGlobalErrors = bindingResult
				.getGlobalErrors()
				.stream()
				.map(globalError -> new ApiGlobalError(
						globalError.getCode())
						)
				.collect(toList());*/

		//	ApiErrorsView apiErrorsView = new ApiErrorsView(apiFieldErrors, apiGlobalErrors);
		//	ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(apiFieldErrors, HttpStatus.UNPROCESSABLE_ENTITY);
	}
	/*
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	protected  ResponseEntity<ErrorDetails> handleConflict(
			RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "This should be application specific";
		System.out.println(bodyOfResponse);

	//	return ResponseEntity.ok(new ErrorDetails(ex.getMessage(), "message"));
		return new ResponseEntity<>(bodyOfResponse, HttpStatus.NOT_FOUND);

		//return new ResponseEntity<ErrorDetails>(HttpStatus.NOT_FOUND);

		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(false));
		System.out.println("body of :" + bodyOfResponse);
		System.out.println(ex.getMessage() + " " + request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		return handleExceptionInternal(ex, bodyOfResponse, 
				new HttpHeaders(), HttpStatus.CONFLICT, request);
	}*/

	//@ExceptionHandler(EmptyResultDataAccessException.class)
	protected @ResponseBody ResponseEntity<?> handleMethodArgumentNotValid(EmptyResultDataAccessException ex, WebRequest request) {
		System.out.println("message :  "+ ex.getMessage());
		System.out.println("desc :  "+ request.getDescription(true));


		//	return new ResponseEntity<>("message" , HttpStatus.BAD_REQUEST);

		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}


	/*
	protected ResponseEntity<Object> handleBadRequest(

			MethodArgumentNotValidException ex, WebRequest request) {


		return  new ResponseEntity<Object>("No data available", new HttpHeaders(), HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	protected ResponseEntity<ErrorDetails> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest request) {
		System.out.println("message :  "+ ex.getMessage());
		System.out.println("desc :  "+ request.getDescription(false));

		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}*/

	/*	@ExceptionHandler//(org.springframework.dao.EmptyResultDataAccessException.class)
	protected ResponseEntity<ErrorDetails> handleMethodArgumentNotValid(org.springframework.dao.EmptyResultDataAccessException ex, WebRequest request) {
		System.out.println("message :  "+ ex.getMessage());
		System.out.println("desc :  "+ request.getDescription(true));

		ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), request.getDescription(true));
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}*/


}
