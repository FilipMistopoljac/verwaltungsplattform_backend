package com.filip.project.group;

import com.filip.project.room.Room;
import com.filip.project.student.Student;
import com.filip.project.trainer.Trainer;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

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

    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "groupId",referencedColumnName = "id")
    private Set<Student> students;

    @OneToOne(mappedBy = "group")
    private Trainer trainer;

    @OneToOne(mappedBy = "group")
    private Room room;

    public Group(String name, String number, String category, String startDate) {
        this.name = name;
        this.number = number;
        this.category = category;
        this.startDate = startDate;
    }
}
