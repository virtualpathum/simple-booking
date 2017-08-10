package com.lk.meeting.room.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_room")
public class RoomEntity extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -302737431134590617L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="is_room_available")
	private Boolean isRoomAvailable;
	
	@Column(name="is_projector_available")
	private Boolean isProjectorAvailable;
	
	@Column(name="number_of_seats")
	private Integer numberOfSeats;
	
	@Column(name="room_location")
	private String roomLocation;
	
	@NotNull
	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id", nullable = false)
	BookingEntity booking;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getIsRoomAvailable() {
		return isRoomAvailable;
	}

	public void setIsRoomAvailable(Boolean isRoomAvailable) {
		this.isRoomAvailable = isRoomAvailable;
	}

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
	
	public BookingEntity getBooking() {
		return booking;
	}

	public void setBooking(BookingEntity booking) {
		this.booking = booking;
	}

	@Override
	public int hashCode() {
			return Objects.hash(this.id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (obj instanceof RoomEntity) {
			RoomEntity other = (RoomEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}
	

} 
