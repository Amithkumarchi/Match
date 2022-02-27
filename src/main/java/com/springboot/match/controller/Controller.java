package com.springboot.match.controller;

import com.springboot.match.model.Player;
import com.springboot.match.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @Autowired
    PlayerRepository playerRepository;
    @GetMapping(value = "/",produces = "text/html")
    public String healthCheck()
    {
        return "Match application is running";
    }


    @PostMapping(value = "/register", produces = "text/html")
    public String test(@RequestBody Player player)
{

   playerRepository.save(player);


    return "abc";
}




}
