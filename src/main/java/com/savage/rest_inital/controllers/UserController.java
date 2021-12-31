package com.savage.rest_inital.controllers;

import com.savage.rest_inital.models.User;
import com.savage.rest_inital.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> getUsers() {
        List<User> data = userService.getAll().stream().distinct().collect(Collectors.toList());
        return ResponseEntity.ok(data);
    }

    @PostMapping()
    public ResponseEntity<User> storeUser(@RequestBody User userRequest) {
        return ResponseEntity.ok(userService.saveUser(userRequest));
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @GetMapping(path = "/query")
    public ArrayList<User> getUsersByPriority(@RequestParam("priority") Integer priority) {
        return userService.getUsersByPriority(priority);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        return userService.deleteUser(id) ? "success" : "failed";
    }


}
