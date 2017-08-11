package com.lk.meeting.room.web.resource.finder;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lk.meeting.room.resource.AbstractResource;

public interface ResourceFinder <R extends AbstractResource<? extends Serializable>, ID extends Serializable> {
	
	R findOne(ID id);
	
	Page<R> findAll(Pageable pageable);

	
	
}
