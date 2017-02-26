package com.akoemov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class FinancialManagerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(FinancialManagerApplication.class, args);
    }

}
