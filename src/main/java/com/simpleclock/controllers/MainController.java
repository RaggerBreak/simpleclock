package com.simpleclock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@RequiredArgsConstructor
@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        Date date = new Date();

        SimpleDateFormat lublin = new SimpleDateFormat("dd-MM-yyy HH:mm");
        SimpleDateFormat newYork = new SimpleDateFormat("dd-MM-yyy HH:mm");
        SimpleDateFormat sydney = new SimpleDateFormat("dd-MM-yyy HH:mm");

        lublin.setTimeZone(TimeZone.getTimeZone("Europe/Warsaw"));
        newYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        sydney.setTimeZone(TimeZone.getTimeZone("Australia/Sydney"));

        model.addAttribute("lublin", lublin.format(date));
        model.addAttribute("newYork", newYork.format(date));
        model.addAttribute("sydney", sydney.format(date));

        System.out.println(lublin.getDateFormatSymbols());

        return "index";
    }
}
