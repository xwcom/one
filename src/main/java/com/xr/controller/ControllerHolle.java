package com.xr.controller;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ControllerHolle {
@GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model){

   model.addAttribute("name",name);

        return "hello";
    }
}
