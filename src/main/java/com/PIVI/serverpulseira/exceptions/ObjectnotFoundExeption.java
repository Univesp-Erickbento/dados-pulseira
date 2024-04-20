package com.PIVI.serverpulseira.exceptions;

public class ObjectnotFoundExeption extends RuntimeException {
    private static final long serialVersionUID = 1L;


    public ObjectnotFoundExeption(String message) {
        super(message);
    }

    public ObjectnotFoundExeption(String message, Throwable cause) {
        super(message, cause);
    }

}