package com.filip.project.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDataLoader implements ApplicationRunner {

    private StudentRepository studentRepository;

    @Autowired
    public StudentDataLoader(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void run(ApplicationArguments arg) {
        studentRepository.save(new Student("Isaac", "Asimov"));
        studentRepository.save(new Student("Ursula K.", "Le Guin"));
        studentRepository.save(new Student("China", "Mieville"));
        studentRepository.save(new Student("Dietmar", "Dath"));
        studentRepository.save(new Student("Cixin", "Liu"));
        studentRepository.save(new Student("Stanislaw", "Lem"));
        studentRepository.save(new Student("Peter", "Watts"));
        studentRepository.save(new Student("Octavia E.", "Butler"));
        studentRepository.save(new Student("Arthur C.", "Clarke"));
        studentRepository.save(new Student("Robert A.", "Heinlein"));
    }
}
