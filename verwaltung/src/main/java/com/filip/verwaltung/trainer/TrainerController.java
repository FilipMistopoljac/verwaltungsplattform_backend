package com.filip.verwaltung.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainerController {

    @ResponseBody
    @RequestMapping(path = "/test")
    public String hello(){
        return "test";
    }


    @Autowired
    TrainerService trainerService;



}
