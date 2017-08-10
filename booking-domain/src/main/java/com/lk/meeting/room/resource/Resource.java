package com.lk.meeting.room.resource;

public interface Resource<T> {
	
	T getResourceId();
	
	void setResourceId(T id);
	
}
