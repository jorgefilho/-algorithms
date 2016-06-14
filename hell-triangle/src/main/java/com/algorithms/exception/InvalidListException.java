package com.algorithms.exception;

public class InvalidListException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidListException(String message) {
		super(message);
	}
}
