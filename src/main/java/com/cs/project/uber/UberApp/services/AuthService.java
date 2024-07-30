package com.cs.project.uber.UberApp.services;

import com.cs.project.uber.UberApp.dto.DriverDto;
import com.cs.project.uber.UberApp.dto.SignupDto;
import com.cs.project.uber.UberApp.dto.UserDto;

public interface AuthService {

    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);
}
