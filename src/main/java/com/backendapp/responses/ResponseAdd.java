package com.backendapp.responses;

public class ResponseAdd {

	private String error;
	private String message;
	
	public ResponseAdd() {
		// TODO Auto-generated constructor stub
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ResponseAdd [error=" + error + ", message=" + message + "]";
	}
	
	

}
