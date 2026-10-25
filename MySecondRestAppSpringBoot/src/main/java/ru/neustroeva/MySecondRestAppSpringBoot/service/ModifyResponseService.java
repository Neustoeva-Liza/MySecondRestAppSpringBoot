package ru.neustroeva.MySecondRestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.neustroeva.MySecondRestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
