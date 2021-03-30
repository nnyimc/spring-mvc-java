package fr.nnyimc.controller;

import fr.nnyimc.model.Address;
import fr.nnyimc.model.Phone;
import fr.nnyimc.model.User;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/user")
public class SignupController {

    @GetMapping("/signup")
    public String getSignupForm(@ModelAttribute("user") User user, Model model){
    	List<String> countryList = Arrays.asList("United States", "China", "France", "Peru", "United Kingdom");
    	model.addAttribute("countryList", countryList);
        return "forward:signup";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user, RedirectAttributes redirectAttributes){
    	redirectAttributes.addFlashAttribute(user) ;      
    	return "redirect:callForm";
    }
    
    @GetMapping("/edit")
    public String editUser(@ModelAttribute("user") User user, Model model) {
    	try {
    		List<String> countryList = Arrays.asList("United States", "China", "France", "Germany", "United Kingdom");
    		
			Phone p = (Phone) Class.forName("fr.nnyimc.model.Phone").newInstance();
			p.setCountryCode("33");
			p.setAreaCode("2");
			p.setNumber("52414040");
			
			Address a = (Address) Class.forName("fr.nnyimc.model.Address").newInstance();
			a.setStreet("15 rue Jacob Litte");
			a.setZipCode("92500");
			
			user.setAddress(a);
			user.setPhone(p);
			
			model.addAttribute("countryList", countryList);
			return "forward:callForm";
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    	return "";
    }
    
    @GetMapping("callForm") 
    public String getSignupForm() {
    	return "signupForm";
    }

}
