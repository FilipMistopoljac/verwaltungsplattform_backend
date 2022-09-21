package com.filip.project.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
public class GroupDataLoader implements ApplicationRunner {

    private GroupRepository groupRepository;

    @Autowired
    public GroupDataLoader(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public void run(ApplicationArguments arg) {
        groupRepository.save(new Group("FIA5", "2", "FIA", "12-31-1999"));
        groupRepository.save(new Group("FIA69", "5", "FIA", "01-01-1900"));
        groupRepository.save(new Group("FUA4", "42", "FIA", "29-42-1245"));
    }
}