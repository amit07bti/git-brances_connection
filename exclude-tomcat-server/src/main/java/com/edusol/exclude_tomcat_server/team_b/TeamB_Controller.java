package com.edusol.exclude_tomcat_server.team_b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamB_Controller {
    @GetMapping("/team_b")
    public String team_b(){
        return "TeamB hello";
    }
}
