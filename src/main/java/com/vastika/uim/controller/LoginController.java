package com.vastika.uim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String getloginPage() {
        return "loginPage";
    }

    @RequestMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("message","Logout Successfull!!!");
        return "loginPage";
    }

    @RequestMapping("/accessDenied")
    public String getAccessDeniedPage(Error error) {
        return "accessDenied";
    }
}
