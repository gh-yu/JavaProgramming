package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception {
	
	public NumRangeException() {}
	public NumRangeException(String msg) {
//		super("1부터 100 사이의 값이 아닙니다."); 
		// java.lang.Exception.Exception(String message)
		// Constructs a new exception with the specified detail message.
		super(msg);
	}
}
