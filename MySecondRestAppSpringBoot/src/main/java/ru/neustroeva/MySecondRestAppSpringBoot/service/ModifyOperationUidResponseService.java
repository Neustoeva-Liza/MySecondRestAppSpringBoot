package ru.neustroeva.MySecondRestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.neustroeva.MySecondRestAppSpringBoot.model.Response;

import java.util.UUID;

@Slf4j
@Service
@Qualifier("ModifyOperationUidResponseService")
public class ModifyOperationUidResponseService
        implements ModifyResponseService{

    @Override
    public Response modify(Response response) {
        log.info("Изменение operationUid, response до: {}", response);

        UUID uuid = UUID.randomUUID();
        response.setOperationUid(uuid.toString());

        log.info("Изменение operationUid, response после: {}", response);
        return response;
    }
}
