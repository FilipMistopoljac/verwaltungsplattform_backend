package com.filip.verwaltung.trainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TrainerRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new TrainerEntity("hobbit", 2424.1, "Bilbo", "adsad", "dasfsf")));
            log.info("Preloading " + repository.save(new TrainerEntity("hobbit", 421.4, "Frodo", "dalds", "dasd")));
        };
    }

}
