package com.filip.project.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TrainerDataLoader implements ApplicationRunner {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerDataLoader(TrainerRepository trainerRepository) {this.trainerRepository = trainerRepository;}

    public void run(ApplicationArguments arg) {
        trainerRepository.save(new Trainer("Cordula" , "Späth", "späth@com.com", "Straße", "fulltime", 2000, "FIA"));
        trainerRepository.save(new Trainer("Cordula" , "Späth", "späth@com.com", "Straße", "fulltime", 2000, "FIA"));
        trainerRepository.save(new Trainer("Cordula" , "Späth", "späth@com.com", "Straße", "fulltime", 2000, "FIA"));
    }
}

