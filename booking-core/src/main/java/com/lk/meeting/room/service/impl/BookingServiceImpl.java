/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.lk.meeting.room.entity.BookingEntity;
import com.lk.meeting.room.mapper.BookingMapper;
import com.lk.meeting.room.repo.BookingRepository;
import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.service.BookingService;

/**
 * @author virtualpathum
 *
 */
@Named("bookService")
public class BookingServiceImpl implements BookingService {

	@Inject
	BookingRepository repo;
	
	@Inject
	BookingMapper mapper;
	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#bookMeetingRoom(com.lk.meeting.room.resource.UserResource, com.lk.meeting.room.resource.MeetingRoomResource)
	 */
	
	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#saveOrUpdate(com.lk.meeting.room.resource.BookingResource)
	 */
	@Override
	public BookingResource saveOrUpdate(BookingResource resource) {
		if(null == resource.getResourceId()){
			return createBooking(resource);
		}else{
			return updateBooking(resource);
		}
	}
	
	
	private BookingResource createBooking(BookingResource resource) {
		BookingEntity entity = mapper.asEntity(resource);
		
		return mapper.asResource(repo.saveAndFlush(entity));
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#cancelBooking(java.lang.Long)
	 */
	@Override
	public void cancelBooking(Long id) {// TODO Auto-generated method stub
		repo.delete(id);
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#updateBooking(com.lk.meeting.room.resource.BookingResource)
	 */

	private BookingResource updateBooking(BookingResource resource) {
		BookingEntity entity = repo.findOne(resource.getResourceId());
		//TODO: perform optimistic locking check
		entity = mapper.updateEntity(resource, entity);

		entity= repo.saveAndFlush(entity);
		return mapper.updateResource(entity, resource);
	}

}
