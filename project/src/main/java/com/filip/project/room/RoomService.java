package com.filip.project.room;

import com.filip.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {this.roomRepository = roomRepository;}

    public List<Room> getRooms() {return roomRepository.findAll();}

    public void addRoom(Room room) {roomRepository.save(room);}
}
