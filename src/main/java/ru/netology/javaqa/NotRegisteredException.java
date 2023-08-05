package ru.netology.javaqa;

public class NotRegisteredException extends RuntimeException {
    NotRegisteredException(String message) {
        super(message);
    }
}