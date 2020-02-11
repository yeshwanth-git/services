package com.insurance.portal.dto;

import java.io.Serializable;

public class InsuranceEventsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3556241879304109978L;
	private long uID;
	private String dateOfIssue;
	private String timeOfIssue;
	private String billedAmount;
	private String coveredAmount;

	public InsuranceEventsDTO() {
	}

	public long getuID() {
		return uID;
	}

	public void setuID(long uID) {
		this.uID = uID;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getTimeOfIssue() {
		return timeOfIssue;
	}

	public void setTimeOfIssue(String timeOfIssue) {
		this.timeOfIssue = timeOfIssue;
	}

	public String getBilledAmount() {
		return billedAmount;
	}

	public void setBilledAmount(String billedAmount) {
		this.billedAmount = billedAmount;
	}

	public String getCoveredAmount() {
		return coveredAmount;
	}

	public void setCoveredAmount(String coveredAmount) {
		this.coveredAmount = coveredAmount;
	}

	@Override
	public String toString() {
		return "InsuranceEvents [uID=" + uID + ", dateOfIssue=" + dateOfIssue + ", timeOfIssue=" + timeOfIssue
				+ ", billedAmount=" + billedAmount + ", coveredAmount=" + coveredAmount + "]";
	}

}
