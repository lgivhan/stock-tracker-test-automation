package com.lgivhan.automation;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@CucumberContextConfiguration
@SpringBootTest (classes = CucumberSpringConfiguration.class) // Point to itself
@ComponentScan(basePackages = "com.lgivhan.automation") // Scan for @Component
public class CucumberSpringConfiguration {
}
