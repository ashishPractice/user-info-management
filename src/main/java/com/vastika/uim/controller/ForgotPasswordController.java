package com.vastika.uim.controller;

import com.vastika.uim.model.User;
import com.vastika.uim.service.UserService;
import com.vastika.uim.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigInteger;
import java.security.SecureRandom;

@Controller
public class ForgotPasswordController {

    @Autowired
    private UserService userService;

    @Autowired
    private JavaMailSender mailSender;

    @RequestMapping(value="/forgotPassword", method = RequestMethod.POST)
    public String forgotPassword(@RequestParam String email){
        System.out.println("Inside forgot password mapping");
        System.out.println(email);
        User user = userService.searchUserByEmail(email);
        if(user != null){
            String password = generatePassword();
            user.setPassword(password);
            userService.updateUser(user);
            String content = "Your new password is: " + password;
            EmailUtil.sendEmail(user.getEmail(),"Forgot-password",content, mailSender);

        }
        return "login";
    }

    private String generatePassword(){
        SecureRandom random = new SecureRandom();
        return new BigInteger(50, random).toString(32);
    }

}
