package com.filip.project.group;

import javax.persistence.*;

@Entity
@Table
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

    public Group() {}

    public Group(long id, String name, String number, String category, String startDate) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.category = category;
        this.startDate = startDate;
    }

    public Group(String name, String number, String category, String startDate) {
        this.name = name;
        this.number = number;
        this.category = category;
        this.startDate = startDate;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", category='" + category + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
