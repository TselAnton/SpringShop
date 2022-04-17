package com.tsel.pet.project.spring.shop.controller;

import com.tsel.pet.project.spring.shop.dto.UserLoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginView() {
        return "login";
    }

    @PostMapping("/login")
    public void login(UserLoginDTO userLoginDTO) {
        System.out.println(userLoginDTO);
    }
}
