package com.training.validator;

public class ApiFieldError {
	
	private String field;

	//private String code;
	private Object rejectedValue;
	private String description;
	

	public ApiFieldError(String field, Object rejectedValue, String description) {
		super();
		this.field = field;
	//	this.code = code;
		this.rejectedValue = rejectedValue;
		this.description = description;
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
/*	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}*/
	public Object getRejectedValue() {
		return rejectedValue;
	}
	
	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
