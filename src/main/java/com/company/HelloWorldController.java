package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "show-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "process-form";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(@RequestParam("studentName")String name, Model model){

        name = name.toUpperCase();

        String result = "Yo! "+name;

        model.addAttribute("message",result);

        return "process-form";
    }
}
