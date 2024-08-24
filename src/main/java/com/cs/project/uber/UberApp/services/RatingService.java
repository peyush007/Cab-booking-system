package com.cs.project.uber.uberApp.services;

import com.cs.project.uber.uberApp.dto.DriverDto;
import com.cs.project.uber.uberApp.dto.RiderDto;
import com.cs.project.uber.uberApp.entities.Driver;
import com.cs.project.uber.uberApp.entities.Ride;
import com.cs.project.uber.uberApp.entities.Rider;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);
    void createNewRating(Ride ride);

}
