package com.kaka.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping(value = "/page1")
    public  String getFirstPage(Model model){
        model.addAttribute("sentence","image.jpg");

        return "firstpage";
    }

}
