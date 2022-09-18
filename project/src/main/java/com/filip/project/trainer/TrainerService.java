package com.filip.project.trainer;

import com.filip.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    @Autowired
    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public List<Trainer> getTrainers() {
        return (List<Trainer>) trainerRepository.findAll();
    }

    public Optional<Trainer> getTrainer(long trainerId) {
        return trainerRepository.findById(trainerId);
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
