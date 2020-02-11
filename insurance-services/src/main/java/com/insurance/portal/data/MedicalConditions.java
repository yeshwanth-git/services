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
@Table(name = "medical_conditions")
public class MedicalConditions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "users_data_id", nullable = false)
	private UserData userData;

	private String medicalConditions;

	public MedicalConditions() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public String getMedicalConditions() {
		return medicalConditions;
	}

	public void setMedicalConditions(String medicalConditions) {
		this.medicalConditions = medicalConditions;
	}

	@Override
	public String toString() {
		return "MedicalConditions [id=" + id + ", userData=" + userData + ", medicalConditions=" + medicalConditions
				+ "]";
	}

}
