package com.cs.project.uber.UberApp.strategies;

import java.util.List;

import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.RideRequest;

public interface DriverMatchingStrategy {

	List<Driver> findMatchingDriver(RideRequest rideRequest);
	
}
