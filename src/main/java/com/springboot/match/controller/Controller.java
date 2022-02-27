package com.springboot.match.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller
{


@GetMapping(value = "/id",produces = "text/html")
    public String test()
{
    return "abc";
}


}
