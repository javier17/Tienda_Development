package com.tienda.Exception;

public class CustomeFieldValidationException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5017034480643102299L;

	private String fieldName;
	
	public CustomeFieldValidationException(String message, String fieldName) {
		super(message);
		this.fieldName = fieldName;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	
}
