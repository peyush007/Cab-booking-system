package com.cs.project.uber.UberApp.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.Ride;
import com.cs.project.uber.UberApp.entities.enums.RideStatus;

public interface RideService {
	
	Ride getRideById(Long rideId);
	
	void matchWithDrivers(RideRequestDto rideRequestDto);
	
	Ride createNewRide(RideRequestDto rideRequestDto,Driver driver);
	
	Ride updateRideStatus(Long rideId,RideStatus rideStatus);
	
	Page<Ride> getAllRidesOfRider(Long riderId,PageRequest pageRequest);
	
	Page<Ride> getAllRidesOfDriver(Long driverId,PageRequest pageRequest);
	
}
