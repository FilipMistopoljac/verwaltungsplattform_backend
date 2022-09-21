package com.filip.project.group;

import com.filip.project.group.Group;
import com.filip.project.student.Student;
import com.filip.project.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private StudentRepository studentRepository;


    public List<Group> getGroups() {
        return (List<Group>) groupRepository.findAll();
    }

    public Optional<Group> getGroup(long groupId) {
        return groupRepository.findById(groupId);
    }

    public void addGroup(Group group) {
        groupRepository.save(group);
    }

    public void put(Group group) {
        groupRepository.save(group);
    }

    public void delete(long groupId) {
        groupRepository.deleteById(groupId);
    }

    public void addStudentToGroup(long groupId, long studentId) {
        Optional<Group> group = groupRepository.findById(groupId);
        Optional<Student> student = studentRepository.findById(studentId);
        group.get().getStudents().add(student.get());

        groupRepository.save(group.get());
        studentRepository.save(student.get());
    }

    public void deleteStudentFromGroup(long groupId, long studentId) {
        Optional<Group> group = groupRepository.findById(groupId);
        Optional<Student> student = studentRepository.findById(studentId);
        group.get().getStudents().remove(student.get());

        groupRepository.save(group.get());
        studentRepository.save(student.get());
    }
}
