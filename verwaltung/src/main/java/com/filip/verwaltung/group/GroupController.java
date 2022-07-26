package com.filip.verwaltung.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroupController {

    @Autowired
    GroupService groupService;
}
