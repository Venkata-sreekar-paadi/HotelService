package com.tbs.hotelservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tbs.hotelservice.entity.Hotel;
import com.tbs.hotelservice.exception.ResourceNotFoundException;
import com.tbs.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> findAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findHotelByHotelId(Integer Id) {
		
		return hotelRepository.findById(Id).orElseThrow(()->new ResourceNotFoundException("Hotel Id you entered is not available in the data base "));
	}

}
