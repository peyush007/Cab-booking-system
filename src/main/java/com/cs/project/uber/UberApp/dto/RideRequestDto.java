package com.cs.project.uber.UberApp.dto;

import java.time.LocalDateTime;

import org.locationtech.jts.geom.Point;

import com.cs.project.uber.UberApp.entities.enums.PaymentMethod;
import com.cs.project.uber.UberApp.entities.enums.RideRequestStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
	
	private Long id;
	
	
	private PointDto pickUpLocation;
	
	
	private PointDto dropOffLocation;
	
	
	private LocalDateTime requestedTime;
	
	
	private RiderDto rider;
	
	
	private PaymentMethod paymentMethod;
	
	
	private RideRequestStatus rideRequestStatus;

}
