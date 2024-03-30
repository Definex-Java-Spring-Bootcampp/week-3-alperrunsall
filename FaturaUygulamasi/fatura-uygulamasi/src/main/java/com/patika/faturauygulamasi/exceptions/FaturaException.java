package com.patika.faturauygulamasi.exceptions;

public class FaturaException extends RuntimeException{

    private String message;

    public FaturaException(String message){
        super(message);
        this.message = message;
    }
}
