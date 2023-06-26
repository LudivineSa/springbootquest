package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorController {

    String[] doctors = {"William Hartnell", "David Tennant", "Jodie Whittaker"};

    @GetMapping("/doctor")
    @ResponseBody
    public String doctor(){
        return "Docteur";
    }

    @RequestMapping("/doctor/{id}")
    @ResponseBody
    public String doctorId(@PathVariable int id){
        if(id <= doctors.length){
            return doctors[id];
        } else {
            return "Il n'y a pas de docteurs avec cet id!";
        }
    }
}
