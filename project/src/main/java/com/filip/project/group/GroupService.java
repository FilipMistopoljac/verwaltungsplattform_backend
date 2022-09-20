package com.filip.project.group;

import com.filip.project.group.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupService {
    @Autowired
    private GroupRepository groupRepository;


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
}
