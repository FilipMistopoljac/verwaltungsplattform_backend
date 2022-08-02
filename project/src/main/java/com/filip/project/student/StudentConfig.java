package com.filip.project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {


            repository.saveAll(
                    List.of(
                            new Student(1, "Filip", "Mistopoljac"),
                        new Student(2, "Filip", "Mistopoljac"),
                        new Student(3, "Filip", "Mistopoljac"))
            );
        };
    }
}
