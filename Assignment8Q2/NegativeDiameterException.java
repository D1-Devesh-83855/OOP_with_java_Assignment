package com.app.shape;

public class NegativeDiameterException extends RuntimeException {

	public NegativeDiameterException() {
	}
	
	public NegativeDiameterException(String message)
	{
		super(message);
	}
}
