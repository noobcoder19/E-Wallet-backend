package com.shuvam.userservice.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(int id) {
        super("User id not found : " + id);
    }

}
