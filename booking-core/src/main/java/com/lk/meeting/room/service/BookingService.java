/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.service;

import com.lk.meeting.room.resource.BookingResource;

/**
 * @author virtualpathum
 *
 */
public interface BookingService {
	
	
	BookingResource saveOrUpdate(BookingResource booking);
	
	void cancelBooking(Long bookingId);
	

}
