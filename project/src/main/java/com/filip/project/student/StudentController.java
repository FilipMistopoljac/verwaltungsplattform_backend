package com.filip.project.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(path = "api/student/get")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping(path = "api/student/add")
    public String registerStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "student has been added";
    }
}
