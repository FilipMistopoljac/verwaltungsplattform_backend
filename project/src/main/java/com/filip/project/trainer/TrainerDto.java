package com.filip.project.trainer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TrainerDto {
    private long trainerId;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String employmentType;
    private double wage;
    private String category;

    private long groupId;
    private String groupName;

    private long roomId;
    private String roomNumber;
}
