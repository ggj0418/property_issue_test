package com.example.property_issue_test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExampleService
{
    
    public ExampleService (
        @Value("${outer-example-service.url}")
        String outerExampleServiceUrl,
        @Value("${outer-service.url}")
        String outerServiceUrl,
        Environment environment
    ) {
        log.info(
            "outerExampleServiceUrl: {}",
            outerExampleServiceUrl
        );
        log.info(
            "outerServiceUrl: {}",
            outerServiceUrl
        );
        String actualExampleServiceUrl = environment.getProperty("EXAMPLE_SERVICE_URL");
        log.info(
            "actualExampleServiceUrl: {}",
            actualExampleServiceUrl
        );
    }
    
    public String getOuterExampleServiceUrl (String a) {
        return a;
    }
}
