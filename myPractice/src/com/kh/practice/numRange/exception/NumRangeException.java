package com.kh.practice.numRange.exception;

public class NumRangeException extends Exception {
	
	public NumRangeException() {}
	public NumRangeException(String msg) {
//		super("1���� 100 ������ ���� �ƴմϴ�."); 
		// java.lang.Exception.Exception(String message)
		// Constructs a new exception with the specified detail message.
		super(msg);
	}
}
