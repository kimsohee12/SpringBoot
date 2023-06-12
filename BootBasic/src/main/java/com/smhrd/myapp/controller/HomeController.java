package com.smhrd.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

   
//   @RequestMapping(value="/", method = RequestMethod.GET) - 스프링 3버전 *옛날 방식
   @GetMapping("/")
   public String main() {
      return "main";
   }
}