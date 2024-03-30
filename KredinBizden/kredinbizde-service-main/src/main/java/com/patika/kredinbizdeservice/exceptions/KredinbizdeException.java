package com.patika.kredinbizdeservice.exceptions;

import org.springframework.beans.factory.annotation.Autowired;

public class KredinbizdeException extends RuntimeException {

    private String message;
    public KredinbizdeException(String message) {
        super(message);
        this.message = message;

    }
}
