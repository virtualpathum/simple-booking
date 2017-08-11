/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.controller.test;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.web.controller.BookingController;
import com.lk.meeting.room.web.controller.MeetingRoomController;
import com.lk.meeting.room.web.controller.UserController;

/**
 * @author virtualpathum
 *
 */
public class BookingControllerTest extends AbstractControllerTest {
	
	@Inject
	BookingController controller;
	
	@Inject
	UserController userController;
	
	@Inject
	MeetingRoomController meetingRoomController;

	@Test
	public void test() {
				
		UserResource userResource = new UserResource();
		userResource.setUserName("Test");
		UserResource createdUser = userController.create(userResource);
		
		System.out.println("createdUser : " + createdUser);
		
		MeetingRoomResource meetingRoomResource = new MeetingRoomResource();
		meetingRoomResource.setNumberOfSeats(10);
		MeetingRoomResource createdMeetingRoom = meetingRoomController.create(meetingRoomResource);
		
		System.out.println("createdMeetingRoom : " + createdMeetingRoom);
		
		BookingResource resource = new BookingResource();
		
		resource.setUser(createdUser);
		resource.setRoom(createdMeetingRoom);
		resource.setBookingDateTime(new Date());
		BookingResource createdBooking = controller.saveOrUpdate(resource);
		
		System.out.println("createdBooking : " + createdBooking);
	}


}
