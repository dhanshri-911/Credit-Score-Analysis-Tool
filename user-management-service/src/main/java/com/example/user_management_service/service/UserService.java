package com.example.user_management_service.service;

import com.example.user_management_service.dto.UserLoginDto;
import com.example.user_management_service.dto.UserRegistrationDto;
import com.example.user_management_service.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public UserEntity saveUser(UserRegistrationDto userRegistrationDto);
    String login(UserLoginDto loginDto);


    List<UserEntity> getAllUsers();
}
