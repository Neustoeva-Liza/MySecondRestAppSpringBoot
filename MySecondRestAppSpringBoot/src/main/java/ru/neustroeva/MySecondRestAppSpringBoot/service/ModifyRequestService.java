package ru.neustroeva.MySecondRestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.neustroeva.MySecondRestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
