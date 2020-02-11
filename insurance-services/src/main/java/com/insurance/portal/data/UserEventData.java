package com.insurance.portal.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_events")
public class UserEventData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "users_data_id", nullable = false)
	private UserData userData;

	private String dateOfIssue;
	private String timeOfIssue;
	private String billedAmount;
	private String coveredAmount;

	public UserEventData() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
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
		return "UserEventData [id=" + id + ", userData=" + userData + ", dateOfIssue=" + dateOfIssue + ", timeOfIssue="
				+ timeOfIssue + ", billedAmount=" + billedAmount + ", coveredAmount=" + coveredAmount + "]";
	}

}
