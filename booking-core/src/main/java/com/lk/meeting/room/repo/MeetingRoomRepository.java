/*
 * 
 */
package com.lk.meeting.room.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lk.meeting.room.entity.MeetingRoomEntity;

/**
 * The Interface RoomRepository.
 */
public interface MeetingRoomRepository extends JpaRepository<MeetingRoomEntity, Long> {
	
	@Query("SELECT m from MeetingRoomEntity m INNER JOIN m.bookings b where m.id = b.room.id and b.bookingDateTime != :bookingDateTime")
	List<MeetingRoomEntity> getAvailableRooms(@Param("bookingDateTime") Date bookingDateTime);
	
	

}
