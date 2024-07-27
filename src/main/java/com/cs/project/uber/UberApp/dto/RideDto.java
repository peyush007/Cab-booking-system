package com.cs.project.uber.UberApp.dto;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.cs.project.uber.UberApp.entities.enums.PaymentMethod;
import com.cs.project.uber.UberApp.entities.enums.RideStatus;



public class RideDto {

	private Long id;

	private Point pickUpLocation;

	private Point dropOffLocation;

	private LocalDateTime createdTime;

	private RiderDto rider;

	private DriverDto driver;

	private PaymentMethod paymentMethod;

	private RideStatus rideStatus;
	
	private String otp;

	private Double fare;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
}
