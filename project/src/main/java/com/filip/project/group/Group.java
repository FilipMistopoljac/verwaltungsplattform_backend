package com.filip.project.group;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.filip.project.room.Room;
import com.filip.project.student.Student;
import com.filip.project.trainer.Trainer;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "student_groups")
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private long id;
    @Column
    private String name;
    @Column
    private String number;
    @Column
    private String category;
    @Column
    private String startDate;

    @OneToMany(targetEntity = Student.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "groupId",referencedColumnName = "id")
    private Set<Student> students;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trainer", referencedColumnName = "id")
    @JsonManagedReference
    private Trainer trainer;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
    @JoinColumn(name = "roomId", referencedColumnName = "id")
    private Room room;

    public Group(String name, String number, String category, String startDate) {
        this.name = name;
        this.number = number;
        this.category = category;
        this.startDate = startDate;
    }
}
