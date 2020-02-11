package com.insurance.portal.response;

public class AddEventResponse {

	private String message;

	public AddEventResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AddEventResponse [message=" + message + "]";
	}

}
