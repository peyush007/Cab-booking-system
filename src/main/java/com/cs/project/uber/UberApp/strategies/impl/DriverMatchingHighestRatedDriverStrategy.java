package com.cs.project.uber.UberApp.strategies.impl;

import com.cs.project.uber.UberApp.entities.Driver;
import com.cs.project.uber.UberApp.entities.RideRequest;
import com.cs.project.uber.UberApp.repositories.DriverRepository;
import com.cs.project.uber.UberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
