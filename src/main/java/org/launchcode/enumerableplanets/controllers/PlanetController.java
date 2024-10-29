package org.launchcode.enumerableplanets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {
        // The compiler automatically adds some special methods when it creates an enum.
        // For example, they have a static values method that returns an array containing
        // all of the values of the enum in the order they are declared.
        // This method is commonly used in combination with the for-each construct
        // to iterate over the values of an enum type.
        // Here you are naming that array "planets"

        model.addAttribute("title", "Test!");
        return "index";
    }
}


