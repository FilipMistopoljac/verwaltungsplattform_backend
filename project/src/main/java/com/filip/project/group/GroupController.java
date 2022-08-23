package com.filip.project.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService, GroupService groupService1) {
        this.groupService = groupService;
    }
    @PostMapping(path = "api/group/add")
    public String registerGroup(@RequestBody Group group) {
        groupService.addGroup(group);
        return "group has been added";
    }

    @GetMapping(path = "api/group/get")
    public List<Group> getGroups() {
        return groupService.getGroups();
    }

    @PutMapping("api/group/put/{groupId}")
    public void putGroup(@RequestBody Group group, @PathVariable String groupId) {
        groupService.put(group);
    }

    @DeleteMapping("api/group/delete/{groupId}")
    public void deleteGroup(@PathVariable long groupId) {
        groupService.delete(groupId);
    }
}
