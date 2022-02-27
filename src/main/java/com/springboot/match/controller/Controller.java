package com.springboot.match.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{

    @GetMapping(value = "/",produces = "text/html")
    public String healthCheck()
    {
        return "Match application is running";
    }


    @GetMapping(value = "/id",produces = "text/html")
    public String test()
{
    return "abc";
}


}
