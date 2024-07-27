package com.cs.project.uber.UberApp.services;

import java.util.List;

import com.cs.project.uber.UberApp.dto.DriverDto;
import com.cs.project.uber.UberApp.dto.RideDto;

public interface DriverService {
	
	RideDto acceptRide(Long rideId);
	
	RideDto cancelRide(Long rideId);
	
	RideDto startRide(Long rideId);
	
	RideDto endRide(Long rideId);
	
	RideDto rateRider(Long rideId,Integer rating);
	
	DriverDto getMyProfile();
	
	List<RideDto> getAllMyRides();
}
