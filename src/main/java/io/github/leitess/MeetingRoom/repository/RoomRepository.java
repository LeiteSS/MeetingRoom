package io.github.leitess.MeetingRoom.repository;

import io.github.leitess.MeetingRoom.model.Room;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
