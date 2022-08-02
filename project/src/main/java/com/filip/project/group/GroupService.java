package com.filip.project.group;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    public List<Group> getGroups() {
        return List.of(
                new Group("sada", "dsad", "sad", "dasf")
        );
    }
}
