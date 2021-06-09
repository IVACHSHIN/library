package com.example.library;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}