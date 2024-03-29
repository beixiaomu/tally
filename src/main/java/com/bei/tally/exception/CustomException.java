package com.bei.tally.exception;

/**
 * @author Administrator 系统自定义异常类
 */
public class CustomException extends Exception {

	private static final long serialVersionUID = 1L;

	// 异常信息
	public String message;

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
