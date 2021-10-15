package com.kr.exception;

public class AlreadyExistingIdException extends RuntimeException {
	public AlreadyExistingIdException (String message) {
        super(message);
    }
}
