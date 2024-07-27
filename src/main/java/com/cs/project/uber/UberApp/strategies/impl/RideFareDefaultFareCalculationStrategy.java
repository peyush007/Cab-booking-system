package com.cs.project.uber.UberApp.strategies.impl;

import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.RideRequest;
import com.cs.project.uber.UberApp.services.DistanceService;
import com.cs.project.uber.UberApp.strategies.RideFareCalculateStrategy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculateStrategy{
	
	private final DistanceService distanceService;

	@Override
	public double calculateFare(RideRequest rideRequest) {
		
		double distance = distanceService.calculateDistance(rideRequest.getPickUpLocation(), rideRequest.getDropOffLocation());
		
		
		return distance*RIDE_FARE_MULTIPLIER;
	}
	
}
