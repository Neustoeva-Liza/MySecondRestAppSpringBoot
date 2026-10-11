package ru.neustroeva.MySecondRestAppSpringBoot.model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    private String uid;

    @NotBlank
    private String operationUid;

    private String systemName;

    @NotBlank
    private String systemTime;

    private String source;

    @NotNull
    @Min(1)
    @Max(100000)
    private Integer communicationId;

    private Integer templateId;
    private Integer productCode;
    private Integer smsCode;
}
