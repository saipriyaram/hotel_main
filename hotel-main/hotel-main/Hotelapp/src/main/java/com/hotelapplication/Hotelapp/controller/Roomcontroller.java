package com.hotelapplication.Hotelapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.hotelapplication.Hotelapp.entity.Room;
import com.hotelapplication.Hotelapp.service.RoomService;

@Controller
public class Roomcontroller {
	
	@Autowired
	private RoomService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
		
	}
	@GetMapping("/room_register")
	public String roomRegister() {
		return"roomRegister";
	}
	@GetMapping("/available_rooms")
	public String getrooms() {
		return"roomlist";
	}
	@PostMapping("/save")
	public String addRoom(@ModelAttribute Room r) {
		service.save(r);
		return "redirect:/available_rooms";
	}

}
