package org.test.spring.boot.extconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ExternalConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExternalConfigApplication.class, args);
    }
}
