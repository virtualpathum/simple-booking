/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.web.controller;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.service.BookingService;
import com.lk.meeting.room.web.resource.finder.BookingResourceFinder;

/**
 * @author virtualpathum
 *
 */
@RestController
@RequestMapping("/bookings")
public class BookingController extends AbstractController {
	
	
	private BookingResourceFinder resourceFinder;
	
	private BookingService service;
	
	@Inject
	public BookingController(BookingResourceFinder resourceFinder, BookingService bookingService){
		this.resourceFinder = resourceFinder;
		this.service = bookingService;
	}
	
	public BookingController(){}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public BookingResource findOne(@PathVariable("id") Long id) {
		return resourceFinder.findOne(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public BookingResource saveOrUpdate(@RequestBody BookingResource resource) {
		return service.saveOrUpdate(resource);
	}

}
