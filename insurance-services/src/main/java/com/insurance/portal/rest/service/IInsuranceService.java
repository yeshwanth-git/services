package com.insurance.portal.rest.service;

import com.insurance.portal.dto.InsuranceEventsDTO;
import com.insurance.portal.dto.UserDTO;

public interface IInsuranceService {
	
	public long saveUser(UserDTO user);
	
	public long saveEvent(InsuranceEventsDTO user);

}
