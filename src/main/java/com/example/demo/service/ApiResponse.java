package com.example.demo.service;

public class ApiResponse {

	String fieldName;
	String fieldValue;
	String message;

	public ApiResponse(String fieldName, String fieldValue, String message) {
		super();
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ApiResponse [fieldName=" + fieldName + ", fieldValue=" + fieldValue + ", message=" + message + "]";
	}

}
