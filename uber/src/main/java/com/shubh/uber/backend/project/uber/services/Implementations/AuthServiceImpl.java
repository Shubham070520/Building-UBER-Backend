package com.shubh.uber.backend.project.uber.services.Implementations;

import com.shubh.uber.backend.project.uber.dto.DriverDto;
import com.shubh.uber.backend.project.uber.dto.SignupDto;
import com.shubh.uber.backend.project.uber.dto.UserDto;
import com.shubh.uber.backend.project.uber.entities.User;
import com.shubh.uber.backend.project.uber.entities.enums.Role;
import com.shubh.uber.backend.project.uber.exceptions.RuntimeConflictException;
import com.shubh.uber.backend.project.uber.repositories.UserRepository;
import com.shubh.uber.backend.project.uber.services.AuthService;
import com.shubh.uber.backend.project.uber.services.RiderService;
import com.shubh.uber.backend.project.uber.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {   //This is done because we want loose coupling

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final RiderService riderService;
    private final WalletService walletService;

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    @Transactional
    //This whole function will either execute everything or it will rollback

    public UserDto signup(SignupDto signupDto) {
        User user = userRepository.findByEmail(signupDto.getEmail()).orElse(null);
        if(user != null)
                throw new RuntimeConflictException("Cannot signup, User already exists with email "+signupDto.getEmail());

        User mappedUser = modelMapper.map(signupDto, User.class);
        mappedUser.setRoles(Set.of(Role.RIDER));

        User savedUser = userRepository.save(mappedUser);
        //When this line is executed, user wont be directly stored to database...it will be stored in local memory
        //Once the code is fully executed then only the user will be saved in the database
        //This prevents data inconsistency

//        create user related entities
        riderService.createNewRider(savedUser);
        walletService.createNewWallet(savedUser);

        return modelMapper.map(savedUser, UserDto.class);
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
