package com.lk.meeting.room.web.controller;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.service.MeetingRoomService;
import com.lk.meeting.room.web.resource.finder.MeetingRoomResourceFinder;

@RestController
@RequestMapping("/rooms")
public class MeetingRoomController extends AbstractController {
	
	private MeetingRoomResourceFinder resourceFinder;
	
	private MeetingRoomService service;
	
	@Inject
	public MeetingRoomController(MeetingRoomResourceFinder roomResourceFinder, MeetingRoomService roomService){
		this.resourceFinder = roomResourceFinder;
		this.service = roomService;
	}
	
	
	public MeetingRoomController(){
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public MeetingRoomResource findOne(@PathVariable("id") Long id) {
		return resourceFinder.findOne(id);
	}
	
	@RequestMapping(value = "/available", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime) {
		return resourceFinder.getAvailableRooms(bookingDateTime);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public MeetingRoomResource create(@RequestBody MeetingRoomResource resource) {
		return service.saveOrUpdate(resource);
	}

}
