package com.filip.project.trainer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.filip.project.group.Group;
import lombok.*;
import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String employmentType;
    @Column
    private double pay;
    @Column
    private String category;

    @OneToOne(mappedBy = "trainer")
    @JsonBackReference
    private Group group;

    public Trainer(String firstName, String lastName, String email, String address, String employmentType, double pay, String category) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.employmentType = employmentType;
        this.pay = pay;
        this.category = category;
    }
}
