package com.filip.project.trainer;

import com.filip.project.student.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {this.trainerService = trainerService;}

    @PostMapping(path ="api/trainer/add")
    public String registerTrainer(@RequestBody Trainer trainer) {
        trainerService.addTrainer(trainer);
        return "trainer added";
    }

    @GetMapping(path = "api/trainer/get")
    public List<Trainer> getTrainers() {
        return trainerService.getTrainers();
    }

    @GetMapping(path = "api/trainer/get/{trainerId}")
    public Optional<Trainer> getTrainer(@PathVariable long trainerId) {
        return trainerService.getTrainer(trainerId);
    }

    @PutMapping("api/trainer/put/{trainerId}")
    public void putTrainer(@RequestBody Trainer trainer, @PathVariable String trainerId) {
        trainerService.put(trainer);
    }

    @DeleteMapping("api/trainer/delete/{trainerId}")
    public void deleteTrainer(@PathVariable long trainerId) {
        trainerService.delete(trainerId);
    }

    @GetMapping("api/trainer/dto/get")
    public List<TrainerDto> convertTrainers() {
        return trainerService.convertTrainers();
    }

}
