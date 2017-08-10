package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.UserResource;

public interface UserService {
	
	UserResource findById(Long Id);
	
	UserResource saveOrUpdate (UserResource resource);

}
