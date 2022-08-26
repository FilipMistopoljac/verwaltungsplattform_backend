package com.filip.project.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class RoomDataLoader implements ApplicationRunner {

    private RoomRepository roomRepository;

    @Autowired
    public RoomDataLoader(RoomRepository roomRepository) {this.roomRepository = roomRepository;}

    public void run(ApplicationArguments arg) {
       roomRepository.save(new Room("07", "Programmiererin", "Ada Lovelace"));
    }
}
