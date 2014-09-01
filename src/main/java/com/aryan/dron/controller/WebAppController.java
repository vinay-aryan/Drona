package com.aryan.dron.controller;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class WebAppController {
    
    @RequestMapping(value={"/welcome","index",""}, method = RequestMethod.GET)
    public String welcome() {
        return "index";
    }
}
