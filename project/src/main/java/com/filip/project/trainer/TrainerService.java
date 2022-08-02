package com.filip.project.trainer;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {

    public List<Trainer> getTrainers() {
        return List.of(
                new Trainer("dsd", "adsd", "askdhasf", "asdasd", 203, "23")
        );
    }
}
