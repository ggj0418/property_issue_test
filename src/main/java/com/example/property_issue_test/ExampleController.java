package com.example.property_issue_test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/example")
public class ExampleController
{
    
    private final ExampleService testService;
    
    public ExampleController (
        ExampleService testService
    ) {
        this.testService = testService;
    }
    
    @GetMapping("/test")
    public String test (
        @RequestParam("test") String test
    ) {
        return testService.getOuterExampleServiceUrl(test);
    }
}
