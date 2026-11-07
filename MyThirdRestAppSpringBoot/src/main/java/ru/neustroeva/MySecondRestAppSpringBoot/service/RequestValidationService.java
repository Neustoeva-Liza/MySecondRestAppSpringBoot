package ru.neustroeva.MySecondRestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.UnsupportedCodeException;
import ru.neustroeva.MySecondRestAppSpringBoot.exception.ValidationFailedException;

@Slf4j
@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            bindingResult.getFieldErrors().forEach(error ->
                    log.error("Ошибка валидации поля {}: {}", error.getField(), error.getDefaultMessage()));
            log.error("Валидация не пройдена, количество ошибок: {}", bindingResult.getErrorCount());
            throw new
                    ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }

    @Override
    public void isUnsupportedCode(String uid) throws UnsupportedCodeException {
        if ("123".equals(uid)) {
            log.error("Неподдерживаемый uid: {}", uid);
            throw new UnsupportedCodeException("uid 123 is not supported");
        }
    }
}
