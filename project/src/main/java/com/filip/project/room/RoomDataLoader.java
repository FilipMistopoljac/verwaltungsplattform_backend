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
        roomRepository.save(new Room("01", "Schutzpatronin der Handwerker und Künstler", "Athena Ergane"));
        roomRepository.save(new Room("02", "Erfinder des Betriebssystems, einer Reihe von Computerprogrammen, welche der Anwendungssoftware Zugriff auf Systemressourcen bereitstellen", "William Windows"));
        roomRepository.save(new Room("03", "Erfinder des sogenannten Automobils und Schutzpatron der Jungunternehmer", "Elon Tesla"));
        roomRepository.save(new Room("04", "Steampunk-Heldin", "Ada Lovelace"));
        roomRepository.save(new Room("05", "Programmierte nach eigenen Angaben auf Gottes Geheiß das Betriebssytem TempleOS", "Terry A. Davis"));
        roomRepository.save(new Room("06", "Deutscher Mathematiker, trug durch seine Forschung zum Interesse Chinesischer MathematikerInnen fuer", "Karl Marx"));
    }
}
