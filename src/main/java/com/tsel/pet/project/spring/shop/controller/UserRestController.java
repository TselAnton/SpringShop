package com.tsel.pet.project.spring.shop.controller;

import com.tsel.pet.project.spring.shop.data.User;
import com.tsel.pet.project.spring.shop.repository.UserRepository;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    private final UserRepository userRepository;

    @Autowired
    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/add/{nickname}")
    public String addUser(@PathParam("nickname") String nickname) {
        User user = User.builder()
            .nickName(nickname)
            .build();

        userRepository.save(user);
        return "User saved";
    }

    @GetMapping("/user/getAll")
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
