package com.filip.project.room;

import javax.persistence.*;

@Entity
@Table
public class Room {

    @Id
    @SequenceGenerator(
            name = "room_sequence",
            sequenceName = "room_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "room_sequence"
    )

    private long id;
    private String number;
    private String description;
    private String personality;

    public Room() {}

    public Room(long id, String number, String description, String personality) {
        this.id = id;
        this.number = number;
        this.description = description;
        this.personality = personality;
    }

    public Room(String number, String description, String personality) {
        this.number = number;
        this.description = description;
        this.personality = personality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", personality='" + personality + '\'' +
                '}';
    }
}
