package com.tam.simplespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tamnguyen on 02/10/2017.
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.addAttribute("title", "Dear guest");
        modelMap.addAttribute("message", "Welcome to Spring boot");
        return "hello";
    }

}
