package com.cs.project.uber.UberApp.services;

import com.cs.project.uber.UberApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
