package com.insurance.portal.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.insurance.portal.dto.InsuranceEventsDTO;
import com.insurance.portal.dto.UserDTO;

@RequestMapping(path="/rest")
public interface IInsuranceRestController {

	@PostMapping(path="/users")
	public ResponseEntity<Object> users(@RequestBody UserDTO user);
	
	@PostMapping(path="/events")
	public ResponseEntity<Object> events(@RequestBody InsuranceEventsDTO user);
	
	@GetMapping(path="/users")
	public ResponseEntity<Object> users();

}
