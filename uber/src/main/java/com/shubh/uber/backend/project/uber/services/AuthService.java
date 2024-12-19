package com.shubh.uber.backend.project.uber.services;

import com.shubh.uber.backend.project.uber.dto.DriverDto;
import com.shubh.uber.backend.project.uber.dto.SignupDto;
import com.shubh.uber.backend.project.uber.dto.UserDto;

public interface AuthService {

    String login(String email , String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId , String vehicleId);

}
