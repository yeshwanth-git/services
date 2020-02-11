package com.insurance.portal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.portal.data.UserEventData;

public interface EventRepository extends JpaRepository<UserEventData, Long> {

}
