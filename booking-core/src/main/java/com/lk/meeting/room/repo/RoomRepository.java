package com.lk.meeting.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.entity.RoomEntity;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {

}
