/*
 * 
 */
package com.lk.meeting.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.entity.MeetingRoomEntity;

/**
 * The Interface RoomRepository.
 */
public interface RoomRepository extends JpaRepository<MeetingRoomEntity, Long> {

}
