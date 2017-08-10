package com.lk.meeting.room.service.impl;

import javax.inject.Inject;

import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.mapper.UserMapper;
import com.lk.meeting.room.repo.UserRepository;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.UserService;

public class UserServiceImpl implements UserService {
	
	@Inject
	UserRepository repo;
	
	@Inject
	UserMapper mapper;

	@Override
	public UserResource findById(Long Id) {
		UserEntity entity = repo.findOne(Id);
		return mapper.asResource(entity);
	}

	@Override
	public UserResource saveOrUpdate(UserResource resource) {
		UserEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

}
