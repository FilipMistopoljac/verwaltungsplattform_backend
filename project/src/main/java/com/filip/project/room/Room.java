package com.filip.project.room;

import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
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
    private String namesake;

    public Room(long id, String number, String description, String namesake) {
        this.id = id;
        this.number = number;
        this.description = description;
        this.namesake = Room.this.namesake;
    }

    public Room(String number, String description, String namesake) {
        this.number = number;
        this.description = description;
        this.namesake = Room.this.namesake;
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
        return namesake;
    }

    public void setPersonality(String namesake) {
        this.namesake = Room.this.namesake;
    }

}
