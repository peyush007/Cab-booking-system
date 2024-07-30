package com.cs.project.uber.UberApp.strategies;

import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
