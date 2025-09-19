package com.edusol.exclude_tomcat_server.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login_Page {

    @GetMapping("/login")
    public String loginPage(){
        return "Login Page Team A";
    }
}
