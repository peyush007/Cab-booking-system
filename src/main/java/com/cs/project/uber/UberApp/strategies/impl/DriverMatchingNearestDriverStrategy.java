package com.cs.project.uber.UberApp.strategies.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.RideRequest;
import com.cs.project.uber.UberApp.repositories.DriverRepository;
import com.cs.project.uber.UberApp.strategies.DriverMatchingStrategy;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {
	
	private final DriverRepository driverRepository;

	@Override
	public List<Driver> findMatchingDriver(RideRequest rideRequest) {
		return driverRepository.findTenNearestDrivers(rideRequest.getPickUpLocation());
	}
	
}
