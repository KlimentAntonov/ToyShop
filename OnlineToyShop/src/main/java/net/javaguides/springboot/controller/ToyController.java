package net.javaguides.springboot.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToyController {
    @GetMapping("/")
    public String viewHomePage(Model model) {
        return "index";
    }

    @GetMapping("/newToy")
    public String viewNewToyPage(Model model) {
        return "new_toy";
    }

}
