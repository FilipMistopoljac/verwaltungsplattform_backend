package com.filip.project.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    private final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public List<Trainer> getTrainers() {
        return trainerRepository.findAll();
    }


    public void addTrainer(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    public void put(Trainer trainer) {
        trainerRepository.save(trainer);
    }

    public void delete(long trainerId) {
        trainerRepository.deleteById(trainerId);
    }
}
