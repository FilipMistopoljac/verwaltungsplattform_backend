package com.filip.project.trainer;

import com.filip.project.trainer.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/trainer")
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

    @PutMapping("api/trainer/put/{trainerId}")
    public void putTrainer(@RequestBody Trainer trainer, @PathVariable String trainerId) {
        trainerService.put(trainer);
    }

    @DeleteMapping("api/trainer/delete/{trainerId}")
    public void deleteTrainer(@PathVariable long trainerId) {
        trainerService.delete(trainerId);
    }

}
