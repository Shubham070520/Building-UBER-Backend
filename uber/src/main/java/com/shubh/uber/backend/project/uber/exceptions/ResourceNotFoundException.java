package com.shubh.uber.backend.project.uber.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
