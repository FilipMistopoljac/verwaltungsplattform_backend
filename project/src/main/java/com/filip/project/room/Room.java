package com.filip.project.room;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.filip.project.group.Group;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private long id;
    private String number;
    private String description;
    private String namesake;

    @OneToOne(mappedBy = "room")
    @JsonBackReference
    private Group group;

    public Room(String number, String description, String namesake) {
        this.number = number;
        this.description = description;
        this.namesake = namesake;
    }
}
