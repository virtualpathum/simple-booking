package com.lk.meeting.room.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@Table(name = "tbl_booking")
public class BookingEntity extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5059693989959757523L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id", nullable = false)
	UserEntity user;
	
	@OneToOne(cascade = { CascadeType.ALL }, mappedBy = "booking", orphanRemoval = true)
	RoomEntity room;
	
	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "booking_date_time", nullable = false)
	Date bookingDateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public RoomEntity getRoom() {
		return room;
	}

	public Date getBookingDateTime() {
		return bookingDateTime;
	}

	public void setBookingDateTime(Date bookingDateTime) {
		this.bookingDateTime = bookingDateTime;
	}
	
	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
		if (null != user && !user.getBookings().contains(this)) {
			user.getBookings().add(this);
		}
	}

	public void setRoom(RoomEntity room) {
		this.room = room;
		if (null != room && room.getBooking() != this) {
			room.setBooking(this);
		}
	}

}
