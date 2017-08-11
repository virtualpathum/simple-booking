/*
 * 
 */
package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.BookingEntity;
import com.lk.meeting.room.entity.MeetingRoomEntity;
import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;



// TODO: Auto-generated Javadoc
/**
 * The Interface RoomMapper.
 */
@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface MeetingRoomMapper {
	
	/**
	 * As resource.
	 *
	 * @param entity the entity
	 * @return the room resource
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
		MeetingRoomResource asResource(MeetingRoomEntity entity);
	
	/**
	 * As entity.
	 *
	 * @param resource the resource
	 * @return the meeting room entity
	 */
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
		MeetingRoomEntity asEntity(MeetingRoomResource resource);
	
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	MeetingRoomResource updateResource(MeetingRoomEntity entity, MeetingRoomResource resource);
	
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	MeetingRoomEntity updateEntity(MeetingRoomResource resource, MeetingRoomEntity entity);

}
