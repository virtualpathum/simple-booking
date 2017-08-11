/*
 * 
 */
package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.MeetingRoomEntity;
import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.resource.UserResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserMapper.
 */
@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface UserMapper {

	/**
	 * As resource.
	 *
	 * @param entity the entity
	 * @return the user resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	UserResource asResource(UserEntity entity);

	/**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the user entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	UserEntity asEntity(UserResource resource);
	
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	UserResource updateResource(UserEntity entity, UserResource resource);
	
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	UserEntity updateEntity(UserResource resource, UserEntity entity);
}
