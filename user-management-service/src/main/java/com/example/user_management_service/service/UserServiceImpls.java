package com.example.user_management_service.service;

import com.example.user_management_service.dto.UserLoginDto;
import com.example.user_management_service.dto.UserRegistrationDto;
import com.example.user_management_service.entity.UserEntity;
import com.example.user_management_service.jwt.JwtUtils;
import com.example.user_management_service.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpls implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    @Override
    public UserEntity saveUser(UserRegistrationDto userRegistrationDto) {
        UserEntity user = new UserEntity();
        user.setUsername(userRegistrationDto.getUserName());
        user.setPassword_hash(passwordEncoder.encode(userRegistrationDto.getPassword()));
        user.setEmail(userRegistrationDto.getEmail());
        user.setCreated_at(new Date());
        user.setStatus("Active");
        user.setRoles(userRegistrationDto.getRoles());
        return userRepo.save(user);
    }

    @Override
    public String login(UserLoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getUsernameOrEmail(),
                        loginDto.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        return jwtUtils.generateJwtToken(authentication);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> users = userRepo.findAll();
        return users;
    }
}
