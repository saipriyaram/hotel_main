package com.hotelapplication.Hotelapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapplication.Hotelapp.entity.Room;
import com.hotelapplication.Hotelapp.repository.RoomRepository;

@Service
public class RoomService {
	
	
	@Autowired
	private RoomRepository rRepo;
	public void save (Room r) {
		rRepo.save(r);
		
	}

}
