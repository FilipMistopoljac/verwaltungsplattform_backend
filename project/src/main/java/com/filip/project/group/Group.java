package com.filip.project.group;

import lombok.*;
import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Group {
    @Id
    @SequenceGenerator(
            name = "group_sequence",
            sequenceName = "group_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "group_sequence"
    )
    private long id;
    private String name;
    private String number;
    private String category;
    private String startDate;

    public Group(String name, String number, String category, String startDate) {
        this.name = name;
        this.number = number;
        this.category = category;
        this.startDate = startDate;
    }
}
