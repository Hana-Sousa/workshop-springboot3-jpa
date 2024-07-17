package com.educandoweb.course.resources;

import com.educandoweb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")

//End-point to access the users
public class UserResources {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "maria", "mariajose@gmail.com", "92981917777", "999999");
        return ResponseEntity.ok().body(u);
    }
}
