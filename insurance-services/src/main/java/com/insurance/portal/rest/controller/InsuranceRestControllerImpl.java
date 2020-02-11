package com.insurance.portal.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.portal.dto.InsuranceEventsDTO;
import com.insurance.portal.dto.UserDTO;
import com.insurance.portal.response.AddEventResponse;
import com.insurance.portal.response.AddUserResponse;
import com.insurance.portal.response.WebResponse;
import com.insurance.portal.rest.service.IInsuranceService;

@RestController
public class InsuranceRestControllerImpl implements IInsuranceRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(InsuranceRestControllerImpl.class);

	@Autowired
	private IInsuranceService insuranceService;

	@Override
	public ResponseEntity<Object> users(UserDTO user) {
		LOGGER.debug("in users " + user);
		long saveUser = insuranceService.saveUser(user);

		AddUserResponse addUserResponse = new AddUserResponse();
		addUserResponse.setMessage("Added user succesfully");
		addUserResponse.setPolicyID(saveUser);

		WebResponse<AddUserResponse> response = new WebResponse<>();
		response.setResults(addUserResponse);
		response.setStatus(HttpStatus.OK.value());

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> users() {
		return new ResponseEntity<>("Response", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> events(InsuranceEventsDTO eventsDTO) {
		insuranceService.saveEvent(eventsDTO);

		WebResponse<AddEventResponse> response;
		AddEventResponse addEventResponse = new AddEventResponse();
		addEventResponse.setMessage("Added user succesfully");

		response = new WebResponse<>();
		response.setResults(addEventResponse);
		response.setStatus(HttpStatus.CREATED.value());

		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}

}
