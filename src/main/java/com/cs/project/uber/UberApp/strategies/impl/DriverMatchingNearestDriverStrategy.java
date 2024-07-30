package com.cs.project.uber.UberApp.strategies.impl;

import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.RideRequest;
import com.cs.project.uber.UberApp.repositories.DriverRepository;
import com.cs.project.uber.UberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
