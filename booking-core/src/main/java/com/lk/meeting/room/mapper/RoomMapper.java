package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.RoomEntity;
import com.lk.meeting.room.resource.RoomResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;



@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface RoomMapper {
	
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
		RoomResource asResource(RoomEntity entity);
	
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
		RoomEntity asEntity(RoomResource resource);

}
