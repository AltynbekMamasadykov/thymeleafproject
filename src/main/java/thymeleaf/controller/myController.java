package thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myController")

public class myController {

    @GetMapping(value = "/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/show/string")
    public String showString(Model model) {
        model.addAttribute("string", "I love Peaksoft");
        return "showString";
    }

}
