package com.lk.meeting.room.web.resource.finder.impl;

import javax.inject.Inject;

import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.UserService;
import com.lk.meeting.room.web.resource.finder.UserResourceFinder;

public class UserResourceFinderImpl implements UserResourceFinder {

	@Inject
	UserService userService;
	
	@Override
	public UserResource findOne(Long id) {
		return userService.findById(id);
	}

}
