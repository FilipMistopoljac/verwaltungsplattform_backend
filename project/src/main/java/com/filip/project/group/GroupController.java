package com.filip.project.group;

import com.filip.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
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

    @GetMapping(path = "api/student/get/{groupId}")
    public Optional<Group> getGroup(@PathVariable long groupId) {
        return groupService.getGroup(groupId);
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
