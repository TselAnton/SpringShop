package com.tsel.pet.project.spring.shop.controller;

import com.tsel.pet.project.spring.shop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String getMainView(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "main-page";
    }

    @GetMapping("/test")
    public String getTestView(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "main-page";
    }
}
