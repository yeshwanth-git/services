package com.insurance.portal.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.portal.data.UserEventData;

@Repository
@Transactional
public class UserEventDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long saveEvent(UserEventData  userEventData) {
		UserEventData merge = entityManager.merge(userEventData);
		return merge.getId();
	}

}
