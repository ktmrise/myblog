package com.ktm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {


    @GetMapping("/link")
    public String link() {
        return "link";
    }
}
