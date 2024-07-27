package com.cs.project.uber.UberApp.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.Ride;
import com.cs.project.uber.UberApp.entities.enums.RideStatus;
import com.cs.project.uber.UberApp.services.RideService;

@Service
public class RideServiceImpl implements RideService {

	@Override
	public Ride getRideById(Long rideId) {
		
		
		return null;
	}

	@Override
	public void matchWithDrivers(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
