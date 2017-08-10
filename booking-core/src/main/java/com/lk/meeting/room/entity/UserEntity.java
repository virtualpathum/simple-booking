package com.lk.meeting.room.entity;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_user")
public class UserEntity extends AbstractEntity {

	private static final long serialVersionUID = 8293376976363606000L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="role")
	private Integer role;
	
	@Column(name="department")
	private String department; 
	
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "user", orphanRemoval = true)
	@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
	@org.hibernate.annotations.BatchSize(size = 30)
	private final Set<BookingEntity> bookings = new LinkedHashSet<>();
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
		
	public Set<BookingEntity> getBookings() {
		return bookings;
	}

	public void setBookings(Set<BookingEntity> bookings) {
		this.bookings.clear();
		if (null != bookings) {
			for (BookingEntity booking : bookings) {
				addBooking(booking);
			}
		}
	}
	
	public void addBooking(BookingEntity booking) {
		this.bookings.add(booking);
		if (null != booking && booking.getUser() != this) {
			booking.setUser(this);
		}
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

		if (obj instanceof UserEntity) {
			UserEntity other = (UserEntity) obj;
			return Objects.equals(this.hashCode(), other.hashCode());
		}
		return false;
	}

}
