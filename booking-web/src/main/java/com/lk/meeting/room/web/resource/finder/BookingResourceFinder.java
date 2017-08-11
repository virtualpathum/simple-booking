/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.web.resource.finder;

import java.util.List;

import com.lk.meeting.room.resource.BookingResource;

/**
 * @author virtualpathum
 *
 */
public interface BookingResourceFinder extends ResourceFinder<BookingResource, Long> {

	List<BookingResource> viewBookingByRoomId(Long roomId);

	List<BookingResource> viewBookingByUserId(Long userId);

}
