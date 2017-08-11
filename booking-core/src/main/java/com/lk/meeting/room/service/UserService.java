/*
 * 
 */
package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.UserResource;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserService {
	
	/**
	 * Find by id.
	 *
	 * @param Id the id
	 * @return the user resource
	 */
	UserResource findById(Long Id);
	
	/**
	 * Save or update.
	 *
	 * @param resource the resource
	 * @return the user resource
	 */
	UserResource saveOrUpdate (UserResource resource);

}
