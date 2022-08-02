package com.filip.project.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1,
                        "1",
                        "SD"
                ),
                new Student(
                        2,
                        "1asdfasf",
                        "SfsaD"
                )
        );
    }


}
