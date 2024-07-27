package com.cs.project.uber.UberApp.services.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.dto.DriverDto;
import com.cs.project.uber.UberApp.dto.RideDto;
import com.cs.project.uber.UberApp.dto.RideRequestDto;
import com.cs.project.uber.UberApp.dto.RiderDto;
import com.cs.project.uber.UberApp.entities.RideRequest;
import com.cs.project.uber.UberApp.entities.Rider;
import com.cs.project.uber.UberApp.entities.User;
import com.cs.project.uber.UberApp.entities.enums.RideRequestStatus;
import com.cs.project.uber.UberApp.repositories.RideRequestRepository;
import com.cs.project.uber.UberApp.repositories.RiderRepository;
import com.cs.project.uber.UberApp.services.RiderService;
import com.cs.project.uber.UberApp.strategies.DriverMatchingStrategy;
import com.cs.project.uber.UberApp.strategies.RideFareCalculateStrategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

	private final ModelMapper modelMapper;
	private final RideFareCalculateStrategy rideFareCalculateStrategy;
	private final DriverMatchingStrategy driverMatchingStrategy;
	private final RideRequestRepository rideRequestRepository;
	private final RiderRepository riderRepository;

	@Override
	public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
		RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
		rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

		Double fare = rideFareCalculateStrategy.calculateFare(rideRequest);
		rideRequest.setFare(fare);

		RideRequest saveRideRequest = rideRequestRepository.save(rideRequest);

		driverMatchingStrategy.findMatchingDriver(rideRequest);

		return modelMapper.map(saveRideRequest, RideRequestDto.class);
	}

	@Override
	public RideDto cancelRide(Long rideId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto rateDrider(Long rideId, Integer rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RiderDto getMyProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RideDto> getAllMyRides() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rider createNewRider(User user) {
		Rider rider = Rider.builder().user(user).Rating(0.0).build();
		return riderRepository.save(rider);
	}

}
