package com.sunbeam.StringClass;

import com.sunbeam.CheckedExceptions.CheckedExceptionLineTooLong;
//import com.sunbeam.CheckedExceptions.ExceptionLineTooLong;

public class LengthChecker {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) throws CheckedExceptionLineTooLong {
		
		if(str.length()>80)
			throw new CheckedExceptionLineTooLong("String length should be upto 80 characters!!!");
	
		this.str = str;
	}
	
	
	
	
}
