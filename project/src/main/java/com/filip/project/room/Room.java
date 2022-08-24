package com.filip.project.room;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "groupId", referencedColumnName = "id")
    private Group group;

    public Room(String number, String description, String namesake) {
        this.number = number;
        this.description = description;
        this.namesake = Room.this.namesake;
    }
}
