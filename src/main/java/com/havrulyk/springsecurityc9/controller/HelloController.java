package com.havrulyk.springsecurityc9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

  @GetMapping
  public String main(){
    return "main.html";
  }

  @PostMapping(value = "/change")
  public String change(){
    return "change.html";
  }
}
