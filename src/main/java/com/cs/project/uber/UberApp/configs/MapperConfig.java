package com.cs.project.uber.UberApp.configs;

import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cs.project.uber.UberApp.dto.PointDto;
import com.cs.project.uber.UberApp.utils.GeometryUtil;

@Configuration
public class MapperConfig {

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		
		mapper.typeMap(PointDto.class, Point.class).setConverter(converter->{
			PointDto pointDto = converter.getSource();
			return GeometryUtil.createPoint(pointDto);
		});
		
		
		mapper.typeMap(Point.class, PointDto.class).setConverter(context->{
			Point point = context.getSource();
			double coordinate[]= {
					point.getX(),
					point.getY()
			};
			return new PointDto(coordinate);
		});
		return mapper;
	}
	
}
