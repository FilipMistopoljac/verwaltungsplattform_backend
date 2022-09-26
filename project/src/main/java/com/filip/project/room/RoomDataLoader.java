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
       roomRepository.save(new Room("01", "Erfinder des Betriebssystems", "William Windows"));
       roomRepository.save(new Room("02", "Erfinder des PKW", "Elon Tesla"));
       roomRepository.save(new Room("03", "Steampunk-Heldin", "Ada Lovelace"));
    }
}
