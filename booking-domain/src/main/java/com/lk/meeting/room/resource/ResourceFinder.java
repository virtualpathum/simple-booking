package com.lk.meeting.room.resource;

import java.io.Serializable;

public interface ResourceFinder <R extends AbstractResource<? extends Serializable>, ID extends Serializable> {
	
	R findOne(ID id);
}
