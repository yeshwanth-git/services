package com.insurance.portal.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName;
	private String lName;
	private String gender;

	@JsonProperty(value = "dob")
	private String dateOfBirth;
	private String email;
	private String ssn;

	private Boolean smoker;
	private String allergies;

	@JsonProperty(value = "medical")
	private String medicalConditions;

	public UserDTO() {
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Boolean getSmoker() {
		return smoker;
	}

	public void setSmoker(Boolean smoker) {
		this.smoker = smoker;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	@Override
	public String toString() {
		return "UserDTO [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth
				+ ", email=" + email + ", ssn=" + ssn + ", smoker=" + smoker + ", allergies=" + allergies
				+ ", medicalConditions=" + medicalConditions + "]";
	}

}
