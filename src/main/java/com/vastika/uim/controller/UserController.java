package com.vastika.uim.controller;

import com.vastika.uim.model.User;
import com.vastika.uim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser(){
        return "addUser";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute User user){

        userService.saveUser(user);
        return "redirect:listUser";
    }


    @RequestMapping(value = {"/listUser"}, method = RequestMethod.GET)
    public String ListUser(Model model){

      //  List<User> userList = userService.getAllUser();
      //  System.out.println(userList);

       // model.addAttribute("userList", userList);
        model.addAttribute("userList", userService.getAllUser());
        return "listUser";
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public String deleteUser(@RequestParam int id, Model model){

        userService.deleteUser(id);
        return "redirect:listUser";
    }


    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public String editUser(@RequestParam int id, Model model){
        model.addAttribute("userList", userService.searchUserById(id));
        return "editUser";
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute User user){

        userService.updateUser(user);
        return "redirect:listUser";
    }



}
