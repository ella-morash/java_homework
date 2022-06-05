package com.company.homewrok_08_06.user;

public class InvalidAgeFieldException extends NumberFormatException{
    public InvalidAgeFieldException(String message) {
        super(message);
    }
}
