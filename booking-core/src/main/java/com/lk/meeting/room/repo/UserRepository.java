package com.lk.meeting.room.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
