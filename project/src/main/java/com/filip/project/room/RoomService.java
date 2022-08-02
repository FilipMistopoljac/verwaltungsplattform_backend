package com.filip.project.room;

import com.filip.project.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    public List<Room> getRooms() {
        return List.of(
                new Room(
                        "sdafd",
                        "1",
                        "SD"
                )
        );
    }
}
