package com.vastika.uim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value="/greet")
    public ModelAndView greet(){
        ModelAndView view = new ModelAndView("hello");
        return view;
    }


//    Passing message to jsp
    @RequestMapping(value="/greet1")
    public ModelAndView greet1(){
        ModelAndView view = new ModelAndView("hello");
        view.addObject("message","Message from controller");
        return view;
    }


    // Getting value from url
    @RequestMapping(value="/greet2")
    public ModelAndView greet2(@RequestParam String firstname){
        ModelAndView view = new ModelAndView("hello");
        view.addObject("message",firstname + " Message from controller");
        return view;
    }

    // Getting value from url
    // Case: if param variable is not same
    // Here url will be greet3?firstnamne=ashish&last_name=shrestha
    @RequestMapping(value="/greet3")
    public ModelAndView greet3(@RequestParam String firstname, @RequestParam("last_name") String lastname){
        ModelAndView view = new ModelAndView("hello");
        view.addObject("message",firstname +" "+lastname +" Message from controller");
        return view;
    }

    // Using pathVariable
    //
    @RequestMapping(value="/greet4/{firstname}/{last_name}")
    public ModelAndView greet4(@PathVariable String firstname, @PathVariable("last_name") String lastname){
        ModelAndView view = new ModelAndView("hello");
        view.addObject("message",firstname +" "+lastname +" Message from controller");
        return view;
    }


}
