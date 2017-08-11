/*
 * 
 */
package com.lk.meeting.room.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.entity.MeetingRoomEntity;
import com.lk.meeting.room.mapper.MeetingRoomMapper;
import com.lk.meeting.room.repo.MeetingRoomRepository;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.service.MeetingRoomService;


// TODO: Auto-generated Javadoc
/**
 * The Class RoomServiceImpl.
 */
@Named("roomService")
public class MeetingRoomServiceImpl implements MeetingRoomService {
	
	/** The repo. */
	@Inject
	MeetingRoomRepository repo;
	
	/** The mapper. */
	@Inject
	MeetingRoomMapper mapper;

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#saveOrUpdate(com.lk.meeting.room.resource.RoomResource)
	 */
	@Override
	public MeetingRoomResource saveOrUpdate(MeetingRoomResource resource) {
		MeetingRoomEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

	

	

}
