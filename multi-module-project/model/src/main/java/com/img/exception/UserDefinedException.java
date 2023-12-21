package com.img.exception;

public class UserDefinedException extends Exception{

    public UserDefinedException(){
        super("Invalid format in user details");
    }
}
