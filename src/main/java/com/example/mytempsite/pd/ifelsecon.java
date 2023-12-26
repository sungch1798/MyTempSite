package com.example.mytempsite.pd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class ifelsecon {
    @GetMapping("/if")
    public String showif(Model model){
        model.addAttribute("Amdin",true);
        return "ifelse";
    }
    @GetMapping("/car01")
    public String carli(Model model){
        ArrayList<String> products =new ArrayList<>();
        products.add("Toyota Corolla");
        products.add("Ford Explorer");
        products.add("Honda Accord");
        products.add("BMW X5");
        products.add("Chevrolet Malibu");
        model.addAttribute("cars",products);
        return "carpd";
    }
}
