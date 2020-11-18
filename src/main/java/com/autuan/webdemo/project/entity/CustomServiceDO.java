package com.autuan.webdemo.project.entity;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "custom.service")
public class CustomServiceDO {
    private String mobile1;
    private String mobile2;
    private String address;
    private String email;
}
