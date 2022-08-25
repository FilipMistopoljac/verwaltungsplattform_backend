package com.filip.project.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;


    public List<Group> getGroups() {
        return (List<Group>) groupRepository.findAll();
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
}
