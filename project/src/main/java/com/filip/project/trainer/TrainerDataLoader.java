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
        trainerRepository.save(new Trainer("Cordula" , "Späth", "c.späth@email.com", "Straße", "Vollzeit", 1700.32, "NT"));
        trainerRepository.save(new Trainer("Mr." , "Hackerman", "mr.hackerman@computer.org", "Straße", "Teilzeit", 200, "NT"));
        trainerRepository.save(new Trainer("Arnold" , "Schönberg", "arnold.schönberg@gmail.com", "Straße", "Vollzeit", 1200, "SW"));
        trainerRepository.save(new Trainer("Steve" , "Jobs", "steve.jobs@hotmail.com", "Straße", "Vollzeit", 10, "SW"));
        trainerRepository.save(new Trainer("Ms." , "Hackerman", "ms.hackerman@server.net", "Straße", "Teilzeit", 1900.01, "FIA"));
        trainerRepository.save(new Trainer("Hephaistos" , "Polymetis", "hephaistos@olympos.to", "Straße", "Teilzeit", 19.99, "FIA"));
    }
}

