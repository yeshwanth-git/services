package com.insurance.portal.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.portal.dao.UserDAOService;
import com.insurance.portal.dao.UserEventDaoService;
import com.insurance.portal.data.MedicalConditions;
import com.insurance.portal.data.UserAllergy;
import com.insurance.portal.data.UserData;
import com.insurance.portal.data.UserEventData;
import com.insurance.portal.dto.InsuranceEventsDTO;
import com.insurance.portal.dto.UserDTO;

@Service
public class InsuranceService implements IInsuranceService {

	@Autowired
	private UserDAOService userDaoService;

	@Autowired
	private UserEventDaoService userEventService;

	@Override
	public long saveUser(UserDTO user) {
		UserData userData = new UserData();
		userData.setfName(user.getfName());
		userData.setlName(user.getlName());
		userData.setEmail(user.getEmail());
		userData.setGender(user.getGender());
		userData.setDateOfBirth(user.getDateOfBirth());
		userData.setSsn(user.getSsn());

		UserAllergy userAllergy = new UserAllergy();
		userAllergy.setAllergies(user.getAllergies());
		userAllergy.setUserData(userData);

		MedicalConditions medicalConditions = new MedicalConditions();
		medicalConditions.setMedicalConditions(user.getMedicalConditions());
		medicalConditions.setUserData(userData);

		userData.setUserAllergy(userAllergy);
		userData.setMedicalConditions(medicalConditions);

		long insertUser = userDaoService.insertUser(userData);
		return insertUser;
	}

	@Override
	public long saveEvent(InsuranceEventsDTO eventsDTO) {

		UserData data = new UserData();
		data.setId(eventsDTO.getuID());

		long user = userDaoService.getUser(data);

		Long saveEvent = null;
		if (user != 0l) {
			UserEventData userEventData = new UserEventData();
			userEventData.setTimeOfIssue(eventsDTO.getTimeOfIssue());
			userEventData.setDateOfIssue(eventsDTO.getDateOfIssue());
			userEventData.setBilledAmount(eventsDTO.getBilledAmount());
			userEventData.setCoveredAmount(eventsDTO.getCoveredAmount());
			userEventData.setUserData(data);
			saveEvent = userEventService.saveEvent(userEventData);
		} else {
			throw new IllegalArgumentException("No such user identifier exists");
		}
		return saveEvent;
	}

}
