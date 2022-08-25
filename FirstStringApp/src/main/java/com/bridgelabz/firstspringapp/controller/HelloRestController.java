package com.bridgelabz.firstspringapp.controller;

import com.bridgelabz.firstspringapp.Model.User;
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
        return "Hello "+name +" !";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user){
        return "Hello "+ user.getFirstName()+" "+ user.getLastName()+" !";
    }
}

