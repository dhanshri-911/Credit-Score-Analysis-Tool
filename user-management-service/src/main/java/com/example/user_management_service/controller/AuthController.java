package com.example.user_management_service.controller;

import com.example.user_management_service.dto.UserLoginDto;
import com.example.user_management_service.jwt.JwtAuthResponse;
import com.example.user_management_service.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/auth")
public class AuthController {


        private UserService authService;

        // Build Login REST API
        @PostMapping("/login")
        public ResponseEntity<JwtAuthResponse> login(@RequestBody UserLoginDto loginDto){
            String token = authService.login(loginDto);

            JwtAuthResponse jwtAuthResponse = new JwtAuthResponse();
            jwtAuthResponse.setAccessToken(token);

            return new ResponseEntity<>(jwtAuthResponse, HttpStatus.OK);
        }

    }

