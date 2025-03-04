package org.todo.todowebservice.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.todo.todowebservice.helloworld.HelloWorldBean;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean basciauth() {
        return new AuthenticationBean("Your are authenticated");
    }
}
