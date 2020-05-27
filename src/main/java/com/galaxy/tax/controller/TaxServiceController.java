package com.galaxy.tax.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taxService")
public class TaxServiceController {
    @RequestMapping("/frame")
    public  String frame(){
        return "/tax/frame";
    }
    @RequestMapping("/top")
    public  String top(){
        return "/tax/top";
    }
    @RequestMapping("/bg")
    public  String bg(){
        return "/common/bg";
    }
    @RequestMapping("/welcome")
    public  String welcome(){
        return "/common/welcome";
    }
    @RequestMapping("/left")
    public  String left(){
        return "/tax/left";
    }

}
