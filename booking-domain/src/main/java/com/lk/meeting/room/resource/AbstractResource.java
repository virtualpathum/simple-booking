package com.lk.meeting.room.resource;

import java.io.Serializable;

public abstract class AbstractResource<T extends Serializable> implements Resource<T> {
	
	protected T resourceId;
	
	public AbstractResource(T resourceId){
		this.resourceId = resourceId;
	}

	public T getResourceId() {
		return resourceId;
	}

	public void setResourceId(T resourceId) {
		this.resourceId = resourceId;
	}
}
