package com.lk.meeting.room.web.resource.finder;



import java.util.Date;
import java.util.List;

import com.lk.meeting.room.resource.MeetingRoomResource;



public interface MeetingRoomResourceFinder extends ResourceFinder<MeetingRoomResource, Long> {
	
	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.RoomService#getAvailableRooms(java.util.Date)
	 */
	
	List<MeetingRoomResource> getAvailableRooms(Date bookingDateTime);
	
}
