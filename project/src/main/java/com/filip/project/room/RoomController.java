package com.filip.project.room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class RoomController {

    private final RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {this.roomService = roomService;}

    @PostMapping(path = "api/room/add")
    public String addRoom(@RequestBody Room room) {
        roomService.addRoom(room);
        return "room added";
    }

    @GetMapping(path = "api/room/get")
    public List<Room> getRooms(){return roomService.getRooms();}

}
