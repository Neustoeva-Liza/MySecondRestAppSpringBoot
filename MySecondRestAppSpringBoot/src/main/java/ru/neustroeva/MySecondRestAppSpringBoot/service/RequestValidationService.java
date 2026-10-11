package ru.neustroeva.MySecondRestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.UnsupportedCodeException;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }

    @Override
    public void isUnsupportedCode(String uid) throws UnsupportedCodeException {
        if ("123".equals(uid)) {
            throw new UnsupportedCodeException("uid 123 is not supported");
        }
    }
}
