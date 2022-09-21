package com.filip.project.student;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {
    private long studentId;
    private String firstName;
    private String lastName;
    private long groupId;
    private String groupName;
    private long roomId;
    private String roomNumber;


}
