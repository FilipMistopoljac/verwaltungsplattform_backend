package com.filip.project.student;

import com.filip.project.group.Group;
import com.filip.project.group.GroupRepository;
import com.filip.project.room.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, GroupRepository groupRepository) {
        this.studentRepository = studentRepository;
        this.groupRepository = groupRepository;
    }

    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStudent(long studentId) {
        return studentRepository.findById(studentId);
    }

    public List<StudentDto> convertStudents() {
        LinkedList<StudentDto> convertedStudents = new LinkedList<>();
        for (Student studentInList : studentRepository.findAll()) {
            convertedStudents.add(convertStudentToDto(studentInList));
        }
        return convertedStudents;
    }

    public StudentDto convertStudentToDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setStudentId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());

        LinkedList<Group> groupsList = new LinkedList<>();
        groupRepository.findAll().forEach(groupsList::add);

        for (Group group : groupsList) {
            if (group.getRoom() != null){
                studentDto.setRoomId(group.getRoom().getId());
                studentDto.setRoomNumber(group.getRoom().getNumber());
            }else {
                studentDto.setRoomId(0);
                studentDto.setRoomNumber("");
            }
            for (Student i : group.getStudents()) {
                if (student.getId() == i.getId()) {
                    studentDto.setGroupId(group.getId());
                    studentDto.setGroupName(group.getName());
                    return studentDto;
                } else {
                    studentDto.setGroupId(0);
                    studentDto.setGroupName("");
                }
            }
        }
        return studentDto;
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
