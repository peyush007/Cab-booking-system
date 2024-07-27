package com.cs.project.uber.UberApp.services.impl;

import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.services.DistanceService;
@Service
public class DistanceServiceOSRMImpl implements DistanceService {

	@Override
	public double calculateDistance(Point src, Point dest) {
		//call the third party api called OSRM for fetch the distance
		return 0;
	}

}
