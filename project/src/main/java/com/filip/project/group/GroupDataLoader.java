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
        groupRepository.save(new Group("NT 1", "1", "NT", "12-31-1999"));
        groupRepository.save(new Group("SW 1", "1", "SW", "01-01-1900"));
        groupRepository.save(new Group("FIA 1", "1", "FIA", "05-10-1696"));
        groupRepository.save(new Group("NT 2", "1", "SW", "01-11-1847"));
        groupRepository.save(new Group("SW 2", "1", "SW", "06-23-1912"));
        groupRepository.save(new Group("FIA 2", "1", "SW", "12-10-1815"));
    }
}