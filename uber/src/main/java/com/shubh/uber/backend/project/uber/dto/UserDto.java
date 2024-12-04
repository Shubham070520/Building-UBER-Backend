package com.shubh.uber.backend.project.uber.dto;

import com.shubh.uber.backend.project.uber.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {

    private String name;

    private String email;

    private Set<Role> roles;
}