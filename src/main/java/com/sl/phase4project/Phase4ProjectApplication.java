package com.sl.phase4project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

@SpringBootApplication
public class Phase4ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Phase4ProjectApplication.class, args);
    }

}
