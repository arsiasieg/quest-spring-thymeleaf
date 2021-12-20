package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.thymeleaf.model.Doctor;

@Controller
public class DoctorController {

    @GetMapping("/doctor/")
    public String doctor(@RequestParam(required=false, defaultValue="0") int number,
                         @RequestParam(required=false, defaultValue="John Smith") String name, Model model) {
    	Doctor doctorIdentity = new Doctor(number, name);
    	model.addAttribute("doctor", doctorIdentity);
        return "doctor.html";
    }
}
