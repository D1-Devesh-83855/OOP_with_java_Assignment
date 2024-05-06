package com.sunbeam.CheckedExceptions;

public class CheckedExceptionLineTooLong extends Exception {

	public CheckedExceptionLineTooLong() {
	}

	//parameterised ctor to call super classes constructor
	public CheckedExceptionLineTooLong(String message) {
		super(message);
	}
}
