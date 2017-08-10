package com.lk.meeting.room.mapper;

import com.lk.meeting.room.entity.UserEntity;
import com.lk.meeting.room.resource.UserResource;

import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;

@Mapper(withIoC = IoC.SPRING,
withCustomFields = { @Field({"id", "resourceId"})})
public interface UserMapper {

	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	UserResource asResource(UserEntity entity);

	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	UserEntity asEntity(UserResource resource);
}
