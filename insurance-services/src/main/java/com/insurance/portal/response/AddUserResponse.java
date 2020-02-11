package com.insurance.portal.response;

public class AddUserResponse {

	private String message;
	private Long policyID;

	public AddUserResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getPolicyID() {
		return policyID;
	}

	public void setPolicyID(Long policyID) {
		this.policyID = policyID;
	}

	@Override
	public String toString() {
		return "AddUserResponse [message=" + message + ", policyID=" + policyID + "]";
	}

}
