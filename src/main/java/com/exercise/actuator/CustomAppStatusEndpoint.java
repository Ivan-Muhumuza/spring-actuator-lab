package com.exercise.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "appstatus")
public class CustomAppStatusEndpoint {

    @ReadOperation
    public String getAppStatus() {
        return "Application is running smoothly!";
    }
}

