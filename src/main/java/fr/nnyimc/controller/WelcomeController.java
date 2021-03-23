package fr.nnyimc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/")
    public String getUsersByCategory(@RequestParam(value = "category", required = false) Integer categoryId,
                                     @RequestParam(value = "country", required = false) Integer countryId) {
        System.out.println("Id: " + categoryId);
        return "welcome";
    }

    @GetMapping("/{catId}/{countryId}")
    public String getUsers(@PathVariable(value = "catId", required = false) Integer categoryId,
                           @PathVariable(value = "countryId", required = false) Integer countryId) {
        System.out.println("Id: " + categoryId + ", Country: " + countryId);
        return "welcome";
    }

}
