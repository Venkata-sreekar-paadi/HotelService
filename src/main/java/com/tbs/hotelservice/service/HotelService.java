package com.tbs.hotelservice.service;

import java.util.List;

import com.tbs.hotelservice.entity.Hotel;
public interface HotelService {
	
	Hotel addHotel(Hotel hotel);
	
	List<Hotel>findAllHotels();
	
	Hotel findHotelByHotelId(Integer Id);

}
