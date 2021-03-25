package fr.nnyimc.controller;

import fr.nnyimc.model.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class SignupController {

    @GetMapping("/signup")
    public String getSignupForm(@ModelAttribute("user") User user, Model model){
    	List<String> countryList = Arrays.asList("United States", "China", "France", "Germany", "United Kingdom");
    	model.addAttribute("countryList", countryList);
        return "signupForm";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user){
        return "signupForm";
    }

}
