package com.filip.project.trainer;

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
    @SequenceGenerator(
            name = "trainer_sequence",
            sequenceName = "trainer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "trainer_sequence"
    )
    private long id;

    private String firstName;

    private String lastName;
    private String email;
    private String address;
    private String employmentType;
    private double pay;
    private String category;

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
