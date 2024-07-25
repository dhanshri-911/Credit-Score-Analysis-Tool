package com.example.user_management_service.dto;


import com.example.user_management_service.entity.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Getter
    @Setter
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
     public class UserRegistrationDto {
        @NotBlank(message = "Username is mandatory")
        private String userName;

       // @Notn(message = "Password is mandatory")
        @Size(min = 6, message = "Password must be at least 6 characters long")
        private String password;

        @NotBlank(message = "Email is mandatory")
        @Email(message = "Email should be valid")
        private String email;

    private Set<Role> roles;

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

