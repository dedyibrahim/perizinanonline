package com.perizinanonline.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PerizinanController {
    
    @GetMapping
    public String index(){
         return "index";
    }
}
