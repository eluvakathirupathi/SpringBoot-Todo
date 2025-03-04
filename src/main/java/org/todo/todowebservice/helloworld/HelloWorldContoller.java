package org.todo.todowebservice.helloworld;

import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
//make it a controller:
@RestController

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
//        throw new RuntimeException("Application Crashed");
        return new HelloWorldBean("THis is a welcome message");
    }

    //path variable
    @GetMapping(path = "/hello/{name}")
    public HelloWorldBean hello(@PathVariable String name){

        return new HelloWorldBean(String.format("hi %s", name));
    }

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
    public void handleOptions() {
        // This method exists only to allow preflight requests
    }
}
