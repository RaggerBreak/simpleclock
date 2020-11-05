package com.simpleclock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.ZoneId;
import java.time.ZonedDateTime;


@RequiredArgsConstructor
@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {

        ZonedDateTime lublin = ZonedDateTime.now(ZoneId.of("Europe/Warsaw"));
        ZonedDateTime newYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime sydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));

        model.addAttribute("lublin", lublin);
        model.addAttribute("newYork", newYork);
        model.addAttribute("sydney", sydney);

        return "index";
    }
}
