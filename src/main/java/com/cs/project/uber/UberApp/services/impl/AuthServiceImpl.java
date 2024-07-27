package com.cs.project.uber.UberApp.services.impl;

import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.cs.project.uber.UberApp.dto.DriverDto;
import com.cs.project.uber.UberApp.dto.SignupDto;
import com.cs.project.uber.UberApp.dto.UserDto;
import com.cs.project.uber.UberApp.entities.Rider;
import com.cs.project.uber.UberApp.entities.User;
import com.cs.project.uber.UberApp.entities.enums.Role;
import com.cs.project.uber.UberApp.exceptions.RuntimeConflictException;
import com.cs.project.uber.UberApp.repositories.UserRepository;
import com.cs.project.uber.UberApp.services.AuthService;
import com.cs.project.uber.UberApp.services.RiderService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
	
	private final UserRepository userRepository;
	private final ModelMapper modelMapper;
	private final RiderService riderService;

	@Override
	public String login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto signup(SignupDto signupDto) {
		
		User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
		if(user!=null) {
			throw new RuntimeConflictException("Cannot signup, User already exist with email "+signupDto.getEmail());
		}
		
		
		
		User mappedUser = modelMapper.map(signupDto, User.class);
		mappedUser.setRoles(Set.of(Role.RIDER));
		User saveUser = userRepository.save(mappedUser);
		
		//create user related entities
		riderService.createNewRider(saveUser);
		//TODO add wallet related service here
		
		return modelMapper.map(saveUser, UserDto.class);
	}

	@Override
	public DriverDto onboardNewDriver(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
