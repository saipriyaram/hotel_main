package com.hotelapplication.Hotelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapplication.Hotelapp.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

}
