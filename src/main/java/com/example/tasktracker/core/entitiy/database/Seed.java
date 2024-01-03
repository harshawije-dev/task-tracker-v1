package com.example.tasktracker.core.entitiy.database;

import com.example.tasktracker.core.entitiy.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

@Configuration
public class Seed {
    private static final Logger log = LoggerFactory.getLogger(Seed.class);

    @Bean
    CommandLineRunner initDatabase(JpaRepository<Task, Long> repository){
        return args -> {
            log.info("Seeding data..."+repository.save(new Task()));
        }
    }
}
