package com.filip.project.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStudent(long studentId) {
        return studentRepository.findById(studentId);
    }


    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void put(Student student) {
        studentRepository.save(student);
    }

    public void delete(long studentId) {
        studentRepository.deleteById(studentId);
    }
}
