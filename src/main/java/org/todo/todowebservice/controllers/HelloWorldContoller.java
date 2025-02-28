package org.todo.todowebservice.controllers;

import org.springframework.web.bind.annotation.*;
import org.todo.todowebservice.HelloWorldBean;

//make it a controller:
@RestController
// cross origin
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldContoller {

    //uri path
    //Get or post method
//    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloworld(){
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("THis is a welcome message");
    }

    //path variable
    @GetMapping(path = "/hello/{name}")
    public HelloWorldBean hello(@PathVariable String name){
        return new HelloWorldBean(String.format("hi %s", name));
    }
}
