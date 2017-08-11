/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.service.impl;

import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.resource.MeetingRoomResource;
import com.lk.meeting.room.resource.UserResource;
import com.lk.meeting.room.service.BookingService;

/**
 * @author virtualpathum
 *
 */
public class BookingServiceImpl implements BookingService {

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#bookMeetingRoom(com.lk.meeting.room.resource.UserResource, com.lk.meeting.room.resource.MeetingRoomResource)
	 */
	@Override
	public BookingResource createBooking(UserResource user, MeetingRoomResource room) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#cancelBooking(java.lang.Long)
	 */
	@Override
	public void cancelBooking(Long bookingId) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#updateBooking(com.lk.meeting.room.resource.BookingResource)
	 */
	@Override
	public BookingResource updateBooking(BookingResource booking) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#viewBookingByRoomId(java.lang.Long)
	 */
	@Override
	public BookingResource viewBookingByRoomId(Long roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#viewBookingByUserId(java.lang.Long)
	 */
	@Override
	public BookingResource viewBookingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
