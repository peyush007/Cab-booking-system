package com.cs.project.uber.UberApp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.project.uber.UberApp.dto.SignupDto;
import com.cs.project.uber.UberApp.dto.UserDto;
import com.cs.project.uber.UberApp.services.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
	
	private final AuthService authService;
	
	@PostMapping("/signup")
	UserDto signUp(@RequestBody SignupDto signupDto) {
		return authService.signup(signupDto);
	}
	

}
