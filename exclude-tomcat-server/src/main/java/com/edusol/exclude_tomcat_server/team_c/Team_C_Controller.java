package com.edusol.exclude_tomcat_server.team_c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Team_C_Controller {
    @GetMapping("/team_c")
    public String teamC(){
        return "Hello Team C";
    }
}
