/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.web.resource.finder.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.lk.meeting.room.entity.BookingEntity;
import com.lk.meeting.room.mapper.BookingMapper;
import com.lk.meeting.room.repo.BookingRepository;
import com.lk.meeting.room.resource.BookingResource;
import com.lk.meeting.room.web.resource.finder.BookingResourceFinder;

/**
 * @author virtualpathum
 *
 */
@Named("bookingResourceFinder")
public class BookingResourceFinderImpl extends AbstractResourceFinder<BookingResource, BookingEntity, BookingRepository, Long> implements BookingResourceFinder {

	private BookingMapper mapper;
	/**
	 * @param repo
	 */
	@Inject
	public BookingResourceFinderImpl(BookingRepository repo, BookingMapper mapper) {
		super(repo);
		this.mapper = mapper;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.web.resource.finder.impl.AbstractResourceFinder#toResource(java.lang.Object)
	 */
	@Override
	protected BookingResource toResource(BookingEntity entity) {
		// TODO Auto-generated method stub
		return mapper.asResource(entity);
	}
	
	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#viewBookingByRoomId(java.lang.Long)
	 */
	//@Override
	@Transactional(readOnly = true)
	public List<BookingResource> viewBookingByRoomId(Long roomId) {
		// TODO Auto-generated method stub
		List<BookingEntity> list= repo.findByRoomId(roomId);
		return toResources(list);

	}

	/* (non-Javadoc)
	 * @see com.lk.meeting.room.service.BookingService#viewBookingByUserId(java.lang.Long)
	 */
	//@Override
	@Transactional(readOnly = true)
	public List<BookingResource> viewBookingByUserId(Long userId) {
		// TODO Auto-generated method stub
		List<BookingEntity> list= repo.findByUserId(userId);
		return toResources(list);
	}

	

	
}
