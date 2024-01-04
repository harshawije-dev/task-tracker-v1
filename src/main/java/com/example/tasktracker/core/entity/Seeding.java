package com.example.tasktracker.core.entity;

import com.example.tasktracker.core.interfaces.IRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Seeding {
    private static final Logger logger = LoggerFactory.getLogger(Seeding.class);

    private final Category category1 = new Category("Checklist");
    private final Category category2 = new Category("Notes");
    private final Task task = new Task("My Checklist", "Last note for checklist", category1);
    private final Task task2 = new Task("My First Note", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", category2);


    @Bean
    CommandLineRunner initSeeding(IRepository repository){
        return args -> {
            logger.info("Seeding..."+ repository.save(task));
            logger.info("Seeding..."+ repository.save(task2));
        };

    }
}
