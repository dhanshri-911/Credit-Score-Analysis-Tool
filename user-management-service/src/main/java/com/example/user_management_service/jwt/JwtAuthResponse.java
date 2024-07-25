package com.example.user_management_service.jwt;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class JwtAuthResponse {
        private String accessToken;
        private String tokenType = "Bearer";


    }


