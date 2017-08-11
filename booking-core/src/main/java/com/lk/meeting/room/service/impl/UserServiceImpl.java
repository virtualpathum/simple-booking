/*
 * 
 */
package com.lk.meeting.room.service.impl;

import javax.inject.Inject;

import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.mapper.UserMapper;
import com.lk.meeting.room.repo.UserRepository;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.UserService;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
public class UserServiceImpl implements UserService {
	
	/** The repo. */
	@Inject
	UserRepository repo;
	
	/** The mapper. */
	@Inject
	UserMapper mapper;

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.UserService#findById(java.lang.Long)
	 */
	@Override
	public UserResource findById(Long Id) {
		UserEntity entity = repo.findOne(Id);
		return mapper.asResource(entity);
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.UserService#saveOrUpdate(com.lk.meeting.room.resource.UserResource)
	 */
	@Override
	public UserResource saveOrUpdate(UserResource resource) {
		UserEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

}
