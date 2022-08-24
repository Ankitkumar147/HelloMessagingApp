package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    //http://localhost:8080/hello/home
    @RequestMapping(value = { "/home"})
    public String sayHello(){
        return "Hello From Bridgelabz!!!";
    }
    // http://localhost:8080/hello/query?name=Mark
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String name){
        return "Hello " + name + " ! ";
    }
}
