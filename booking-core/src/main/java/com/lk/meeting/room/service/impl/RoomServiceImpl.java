package com.lk.meeting.room.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.entity.RoomEntity;
import com.lk.meeting.room.mapper.RoomMapper;
import com.lk.meeting.room.repo.RoomRepository;
import com.lk.meeting.room.resource.RoomResource;
import com.lk.meeting.room.service.RoomService;


@Named("roomService")
public class RoomServiceImpl implements RoomService {
	
	@Inject
	RoomRepository repo;
	
	@Inject
	RoomMapper mapper;

	@Override
	public RoomResource saveOrUpdate(RoomResource resource) {
		RoomEntity entity = mapper.asEntity(resource);
		return mapper.asResource(repo.saveAndFlush(entity));
	}

	@Override
	public RoomResource findById(Long Id) {
		RoomEntity entity = repo.findOne(Id);
		return mapper.asResource(entity);
	}

}
