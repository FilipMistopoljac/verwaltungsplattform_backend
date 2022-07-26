package com.filip.verwaltung.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    @Autowired
    TrainerService trainerService;



}
