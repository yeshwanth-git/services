package com.insurance.portal.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.insurance.portal.data.UserData;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insertUser(UserData user) {
		entityManager.persist(user);
		return user.getId();
	}
	
	public long getUser(UserData user) {
		UserData find = entityManager.find(UserData.class, user);
		return find.getId();
	}
	

}
