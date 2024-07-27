package com.cs.project.uber.UberApp.utils;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;

import com.cs.project.uber.UberApp.dto.PointDto;

public class GeometryUtil {
	public static Point createPoint(PointDto pointDto) {
        // Correctly pass SRID as an integer
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);
        Coordinate coordinate = new Coordinate(pointDto.getCoordinates()[0], pointDto.getCoordinates()[1]);
        return geometryFactory.createPoint(coordinate);
    }

}
