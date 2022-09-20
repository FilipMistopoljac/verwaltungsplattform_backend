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
        groupRepository.save(new Group("FIA2", "2", "FIA", "12-31-1999"));
        groupRepository.save(new Group("FIA2", "2", "FIA", "01-01-1900"));
    }
}