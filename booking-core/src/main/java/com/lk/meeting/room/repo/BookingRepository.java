/**
 * Created On : 11 Aug 2017
 */
package com.lk.meeting.room.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lk.meeting.room.entity.BookingEntity;

/**
 * @author virtualpathum
 *
 */
public interface BookingRepository extends JpaRepository<BookingEntity, Long> {

	List<BookingEntity> findByUserId(Long userId);

	List<BookingEntity> findByRoomId(Long roomId);

}
