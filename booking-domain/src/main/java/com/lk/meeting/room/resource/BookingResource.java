package com.lk.meeting.room.resource;

import java.util.Date;

public class BookingResource extends AbstractResource<Long> {
	
	public BookingResource(Long resourceId) {
		super(resourceId);
		// TODO Auto-generated constructor stub
	}
	
	public BookingResource(){
		super(null);
	}

	UserResource user;
	
	MeetingRoomResource room;
	
	Date bookingDateTime;

	public UserResource getUser() {
		return user;
	}

	public void setUser(UserResource user) {
		this.user = user;
	}

	public MeetingRoomResource getRoom() {
		return room;
	}

	public void setRoom(MeetingRoomResource room) {
		this.room = room;
	}

	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("id = " + this.getResourceId())
				.append(" , user = " + this.getUser().getResourceId())
				.append(" , room = " + this.getRoom().getResourceId()).toString();
				
	}
	
}
