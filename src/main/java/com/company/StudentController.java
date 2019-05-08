package com.company;

import com.company.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/register")
    public String signIn(@Valid @ModelAttribute("student")Student student, BindingResult result){
        if (result.hasErrors()){
            return "student-form";
        } else
        return "student-confirmation";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){

        Student student = new Student();

        model.addAttribute("student", student);

        return "student-form";
    }
}
