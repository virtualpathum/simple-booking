package com.lk.meeting.room.controller.test;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.web.controller.MeetingRoomController;

public class MeetingRoomControllerTest extends AbstractControllerTest {
	
	@Inject
	MeetingRoomController meetingRoomController;


	@Test
	public void test() {
				
		MeetingRoomResource resource = new MeetingRoomResource();
		resource.setIsProjectorAvailable(true);
		resource.setNumberOfSeats(10);
		resource.setRoomLocation("1st Floor");
		meetingRoomController.create(resource);
		
		
	}

	@Test
	public void test2() {
				
	
		
		List<MeetingRoomResource> list = meetingRoomController.getAvailableRooms(new Date());
		for(MeetingRoomResource r:list){
			System.out.println("room id"+r.getResourceId());
		}
		System.out.println("list //"+list.size());
	}
}
