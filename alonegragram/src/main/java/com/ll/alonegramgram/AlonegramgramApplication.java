package com.ll.alonegramgram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AlonegramgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlonegramgramApplication.class, args);
    }

}
