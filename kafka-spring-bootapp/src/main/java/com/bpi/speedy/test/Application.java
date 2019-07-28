package com.bpi.speedy.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bpi.speedy.test")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
