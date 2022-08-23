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

    @PostMapping(path = "api/student/add")
    public String registerStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "student has been added";
    }

    @GetMapping(path = "api/student/get")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PutMapping("api/student/put/{studentId}")
    public void putStudent(@RequestBody Student student, @PathVariable String studentId) {
        studentService.put(student);
    }

    @DeleteMapping("api/student/delete/{studentId}")
    public void deleteStudent(@PathVariable long studentId) {
        studentService.delete(studentId);
    }




}
