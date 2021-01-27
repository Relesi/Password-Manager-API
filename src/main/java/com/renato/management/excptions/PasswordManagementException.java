package com.renato.management.excptions;

public class PasswordManagementException extends RuntimeException {

	private static final long serialVersionUID = 692935558423031577L;

	public PasswordManagementException() {
		super();
	}

	public PasswordManagementException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PasswordManagementException(String msg) {
		super(msg);
	}

	public PasswordManagementException(Throwable cause) {
		super(cause.getMessage(), cause);
	}
}