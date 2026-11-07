package ru.neustroeva.MySecondRestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.neustroeva.MySecondRestAppSpringBoot.model.Response;
import ru.neustroeva.MySecondRestAppSpringBoot.util.DateTimeUtil;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService
        implements ModifyResponseService{

    @Override
    public Response modify(Response response) {
        log.info("Изменение systemTime, response до: {}", response);

        response.setSystemTime(DateTimeUtil.getCustomFormat()
                .format(new Date()));

        log.info("Изменение systemTime, response после: {}", response);
        return response;
    }
}
