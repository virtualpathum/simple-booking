package com.lk.meeting.room.resource;

public class MeetingRoomResource extends AbstractResource<Long> {

	public MeetingRoomResource(Long resourceId) {
		super(resourceId);
	}
	
	public MeetingRoomResource(){
		super(null);
	}

	private Boolean isProjectorAvailable;
	
	private Integer numberOfSeats;
	
	private String roomLocation;

	public Boolean getIsProjectorAvailable() {
		return isProjectorAvailable;
	}

	public void setIsProjectorAvailable(Boolean isProjectorAvailable) {
		this.isProjectorAvailable = isProjectorAvailable;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getRoomLocation() {
		return roomLocation;
	}

	public void setRoomLocation(String roomLocation) {
		this.roomLocation = roomLocation;
	}
	
	
}
