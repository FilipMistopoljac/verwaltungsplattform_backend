package com.filip.verwaltung.trainer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TrainerEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String category;
    private double pay;

    private String name;

    private String email;

    private String address;

    // constructor
    public TrainerEntity() {}

    public TrainerEntity(String category, double pay, String name, String email, String address) {
        this.category = category;
        this.pay = pay;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // getter und setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
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

    @Override
    public String toString() {
        return "TrainerEntity{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
