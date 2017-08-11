/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.resource.UserResource;

/**
 * @author virtualpathum
 *
 */
public interface BookingService {
	
	
	
	BookingResource createBooking(UserResource user, MeetingRoomResource room);
	
	void cancelBooking(Long bookingId);
	
	BookingResource updateBooking(BookingResource booking);
	
	BookingResource viewBookingByRoomId(Long roomId);
	
	BookingResource viewBookingByUserId(Long userId);

}
