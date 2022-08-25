package com.bridgelabz.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

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
    //http://localhost:8080/hello/param/Mark
    @GetMapping("/param/{name}")
        public String sayHelloParam(@PathVariable String name){
        return "Hello "+name +"!";
        }
    }

