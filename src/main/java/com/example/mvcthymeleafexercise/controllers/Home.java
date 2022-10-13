package com.example.mvcthymeleafexercise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class Home {

    List<String> listOfContact = new ArrayList<>(
            Arrays.asList("Roudabeh Ad","Sara Olg","Steev Star"));

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact/contact";
    }

    @PostMapping("/contact")
    public String contact(@RequestParam("name") String name){
        listOfContact.add(name);
        return "contact/contact";

    }

    @GetMapping("/list")
    public String contactList(Model model){

        model.addAttribute("contacts",listOfContact);

        return "contact/contactList";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }


}
