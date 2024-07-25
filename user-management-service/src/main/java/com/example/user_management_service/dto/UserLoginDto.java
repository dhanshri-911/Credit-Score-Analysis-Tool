package com.example.user_management_service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;


@Data
public class UserLoginDto {

        @NotBlank(message = "Username is mandatory")
        private String  usernameOrEmail;

        @NotBlank(message = "Password is mandatory")
        private String password;



    // Getters and Setters
    }

