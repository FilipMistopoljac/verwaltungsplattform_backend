package com.filip.project.student;

import com.filip.project.group.GroupRepository;
import com.filip.project.group.GroupService;
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
        studentRepository.save(new Student("Doktor", "Sigma"));
        studentRepository.save(new Student("Mister", "Hackerman"));
        studentRepository.save(new Student("Anna", "Mnese"));
        studentRepository.save(new Student("Nick L.", "Beck"));
        studentRepository.save(new Student("Cixin", "Liu"));
    }
}
