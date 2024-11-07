package com.iiht.training.grocery.exceptions;

public class GroceryNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GroceryNotFoundException() {

	}

	public GroceryNotFoundException(String message) {
		super(message);
	}
}
