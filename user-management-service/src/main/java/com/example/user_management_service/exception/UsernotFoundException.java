package com.example.user_management_service.exception;

public class UsernotFoundException extends RuntimeException{
    public  UsernotFoundException(String message){
        super(message);
    }

}
