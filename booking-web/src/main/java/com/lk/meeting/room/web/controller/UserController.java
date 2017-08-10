package com.lk.meeting.room.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.UserService;
import com.lk.meeting.room.web.resource.finder.UserResourceFinder;

@RestController
@RequestMapping("/users")
public class UserController extends AbstractController {
	
private UserResourceFinder userResourceFinder;
	
	@Autowired
	private UserService userService;
	
	public UserController(){
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public UserResource findOne(@PathVariable("id") Long id) {
		return userResourceFinder.findOne(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public UserResource create(@RequestBody UserResource resource) {
		System.out.println("userService///"+userService);
		return userService.saveOrUpdate(resource);
	}


}
