package com.insurance.portal.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users_data")
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String fName;
	private String lName;
	private String gender;
	private String dateOfBirth;
	private String email;
	private String ssn;

	@OneToOne(mappedBy = "userData", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UserAllergy userAllergy;

	@OneToOne(mappedBy = "userData", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private MedicalConditions medicalConditions;
	
	@OneToOne(mappedBy = "userData", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UserEventData eventData;

	public UserData() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public UserAllergy getUserAllergy() {
		return userAllergy;
	}

	public void setUserAllergy(UserAllergy userAllergy) {
		this.userAllergy = userAllergy;
	}

	public MedicalConditions getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(MedicalConditions medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	@Override
	public String toString() {
		return "UserData [id=" + id + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", dateOfBirth="
				+ dateOfBirth + ", email=" + email + ", ssn=" + ssn + ", userAllergy=" + userAllergy
				+ ", medicalConditions=" + medicalConditions + "]";
	}
	
	
}
