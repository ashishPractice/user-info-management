package com.vastika.uim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String getloginPage() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("message","Logout Successfull!!!");
        return "login";
    }

    @RequestMapping("/accessDenied")
    public String getAccessDeniedPage(Error error) {
        return "accessDenied";
    }
}
