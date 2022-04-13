package com.tsel.pet.project.spring.shop.controller;

import com.tsel.pet.project.spring.shop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String getMessage(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "main-page";
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class MessageTemp {
        private String name;
        private String message;
    }
}
