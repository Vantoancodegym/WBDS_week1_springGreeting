package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class Greeting {
    @GetMapping
    public ModelAndView greet(@RequestParam String name){
        ModelAndView modelAndView=new ModelAndView("greet");
        modelAndView.addObject("name",name);
        return modelAndView;
    }
}
