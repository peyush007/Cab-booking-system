package com.cs.project.uber.UberApp.services;

import com.cs.project.uber.UberApp.dto.DriverDto;
import com.cs.project.uber.UberApp.dto.RideDto;
import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.dto.RiderDto;
import com.cs.project.uber.UberApp.entities.Rider;
import com.cs.project.uber.UberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
