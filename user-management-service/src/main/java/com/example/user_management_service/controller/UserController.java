package com.example.user_management_service.controller;

import com.example.user_management_service.dto.UserRegistrationDto;
import com.example.user_management_service.entity.UserEntity;
import com.example.user_management_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserEntity> registerUser(@Valid @RequestBody UserRegistrationDto userRegistrationDto){
  UserEntity newUser = userService.saveUser(userRegistrationDto);
  return ResponseEntity.status(201).body(newUser);
    }

    @GetMapping("/getList")
     public  ResponseEntity<List<UserEntity>> getAll(){
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
}


}
