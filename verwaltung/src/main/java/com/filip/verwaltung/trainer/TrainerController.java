package com.filip.verwaltung.trainer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrainerController {

    private final TrainerRepository repository;

    public TrainerController(TrainerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/trainers")
    List<TrainerEntity> all(){
        return repository.findAll();
    }

    @PostMapping("/trainers")
    TrainerEntity newTrainerEntity(@RequestBody TrainerEntity newTrainerEntity){
        return repository.save(newTrainerEntity);

    }
}
