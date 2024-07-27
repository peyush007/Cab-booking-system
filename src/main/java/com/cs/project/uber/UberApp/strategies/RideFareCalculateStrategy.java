package com.cs.project.uber.UberApp.strategies;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.RideRequest;

public interface RideFareCalculateStrategy {
	
	double RIDE_FARE_MULTIPLIER = 10;
	
	double calculateFare(RideRequest rideRequest);

}
