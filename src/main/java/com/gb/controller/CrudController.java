package com.gb.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CrudController {

   @RequestMapping("/employee")
    public String getEmployee(){




       return "hii";
    }
}
