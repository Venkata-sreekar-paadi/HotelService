package com.tbs.hotelservice.exception;

public class ResourceNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Hotel Resource Not Found Exception");
	}
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
