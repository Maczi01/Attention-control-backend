package com.example.attentioncontolbackend.service.exception;

public class WrongNumberException extends RuntimeException {
    public WrongNumberException(Integer nubmerToCheck) {
        super("Wrong number");
    }
}
