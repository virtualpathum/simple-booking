package com.lk.meeting.room.web.resource.finder.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.mapper.UserMapper;
import com.lk.meeting.room.repo.UserRepository;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.web.resource.finder.UserResourceFinder;

@Named("userResourceFinder")
public class UserResourceFinderImpl extends AbstractResourceFinder<UserResource, UserEntity, UserRepository, Long> implements UserResourceFinder {

	private UserMapper mapper;
	/**
	 * @param repo
	 */
	@Inject
	public UserResourceFinderImpl(UserRepository repo, UserMapper mapper) {
		super(repo);
		this.mapper = mapper;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.web.resource.finder.impl.AbstractResourceFinder#toResource(java.lang.Object)
	 */
	@Override
	protected UserResource toResource(UserEntity entity) {
		// TODO Auto-generated method stub
		return mapper.asResource(entity);
	}



}
