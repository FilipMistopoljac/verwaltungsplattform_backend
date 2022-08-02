package com.filip.project.trainer;

import com.filip.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/trainer")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {this.trainerService = trainerService;}

    @GetMapping
    public List<Trainer> getTrainers() {
        return trainerService.getTrainers();
    }
}
