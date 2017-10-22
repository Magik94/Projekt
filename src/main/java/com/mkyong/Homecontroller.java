package com.mkyong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class Homecontroller {
    @Controller
    public class HomeController {
        @RequestMapping("/")
        public String welcome(Model model){
            model.addAttribute("greeting", "witaj kurwa");
            model.addAttribute("tagline", "chuj w dupe");
            return  "welcome";
        }
    }
}
