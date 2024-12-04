package com.shubh.uber.backend.project.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class DriverDto {

    private UserDto user;

    private Double rating;


}