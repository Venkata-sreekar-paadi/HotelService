package com.tbs.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbs.hotelservice.entity.Hotel;
import com.tbs.hotelservice.service.HotelService;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@PostMapping("/addHotel")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
		Hotel createdHotel = hotelService.addHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
	}

	@GetMapping("/findAllHotels")
	public ResponseEntity<List<Hotel>> getAllHotel() {
		List<Hotel> hotels = hotelService.findAllHotels();
		return ResponseEntity.ok(hotels);

	}

	@GetMapping("/findHotel/{id}")
	public ResponseEntity<Hotel> getHotelByID(@PathVariable Integer id) {
		Hotel hotel = hotelService.findHotelByHotelId(id);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}

}
