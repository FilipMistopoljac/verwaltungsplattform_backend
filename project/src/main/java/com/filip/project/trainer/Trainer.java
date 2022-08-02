package com.filip.project.trainer;

import javax.persistence.*;

@Entity
@Table
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
    private String name;
    private String email;
    private String address;
    private String employmentType;
    private double pay;
    private String category;

    public Trainer() {}

    public Trainer(long id, String name, String email, String address, String employmentType, double pay, String category) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.employmentType = employmentType;
        this.pay = pay;
        this.category = category;
    }

    public Trainer(String name, String email, String address, String employmentType, double pay, String category) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.employmentType = employmentType;
        this.pay = pay;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", pay=" + pay +
                ", category='" + category + '\'' +
                '}';
    }
}
