package ru.neustroeva.MySecondRestAppSpringBoot.exception;

public class ValidationFailedException extends Exception{
    public ValidationFailedException(String message) { super(message); }
}
