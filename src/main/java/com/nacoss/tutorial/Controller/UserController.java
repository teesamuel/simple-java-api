package com.nacoss.tutorial.Controller;


import com.nacoss.tutorial.model.persistence.User;
import com.nacoss.tutorial.model.persistence.repositories.UserRepository;
import com.nacoss.tutorial.model.persistence.request.UserCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/id/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.of(userRepository.findById(id));
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> findByUserName(@PathVariable String username) {
        User user = userRepository.findByUsername(username);
    if (user == null){
        return ResponseEntity.notFound().build();
        } else return  ResponseEntity.ok(user);
    //or //     return user == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(user);
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody UserCreateRequest  userCreateRequest) {
        User user = new User();
        user.setUsername(userCreateRequest.getUsername());
        user.setLastname(userCreateRequest.getLastname());
        user.setFirstname(userCreateRequest.getFirstname());
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

}
