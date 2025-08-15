package com.pl.premier_zone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.pl.premier_zone.model")
@EnableJpaRepositories("com.pl.premier_zone.repository")
public class PremierZoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(PremierZoneApplication.class, args);
    }
}
