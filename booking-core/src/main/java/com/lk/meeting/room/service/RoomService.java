package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.RoomResource;

public interface RoomService {
	
	RoomResource findById(Long Id);
	
	RoomResource saveOrUpdate (RoomResource resource);
 
}
