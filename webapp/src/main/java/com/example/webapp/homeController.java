package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


@Controller
public class homeController {
    @RequestMapping("home")
    public ModelAndView home(Alien alien) {
        System.out.println(alien.getAid());
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj", alien);
        mv.setViewName("home");
        return mv;
    }
    
}
