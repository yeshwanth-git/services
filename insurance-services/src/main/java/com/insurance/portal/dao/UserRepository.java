package com.insurance.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.portal.data.UserData;


public interface UserRepository extends JpaRepository<UserData, Long>{
	
}
