package com.exception;

public class PlayerNotFoundException extends RuntimeException {

	public PlayerNotFoundException(String str) {
		super(str);
	}
}
