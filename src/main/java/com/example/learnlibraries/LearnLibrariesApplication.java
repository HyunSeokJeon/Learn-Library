package com.example.learnlibraries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LearnLibrariesApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnLibrariesApplication.class, args);
    }

}
