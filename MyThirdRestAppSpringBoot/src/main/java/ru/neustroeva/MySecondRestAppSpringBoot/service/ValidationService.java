package ru.neustroeva.MySecondRestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.UnsupportedCodeException;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
    void isUnsupportedCode(String uid) throws UnsupportedCodeException;
}
