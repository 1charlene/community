package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name",name);
        System.out.println("111111");
        System.out.println("111111");
        return "hello";
    }
}
