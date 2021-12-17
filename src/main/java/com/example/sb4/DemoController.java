package com.example.sb4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("/")
    public String index()
    {
        return"index";
    }
    @PostMapping(value="/save")
    public ModelAndView save(@ModelAttribute User us)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-data");
        modelAndView.addObject("us", us);
        return modelAndView;
    }
}
