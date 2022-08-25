package com.filip.project.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GroupDataLoader implements CommandLineRunner {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public void run(String... args) throws Exception {

        groupRepository.save(new Group("sadsad","sdasd","sad","asd"));

    }
}