package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
	
    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("titulo", "Inicio");
        model.addAttribute("mensaje", "Bienvenido a la página de videojuegos");
        return "index";
    }
    @GetMapping("/contact")
    public String  Contacto(Model model){
        return "contact";
    }
    @GetMapping("/bot")
    public String bot(Model model){
        return "Bot";
    }
    @GetMapping("/about")
    public String about(Model model){
        return "about";
    }
    @GetMapping("/catalogo")
    public String login(Model model){
        return "catalogo";
    }
    

}
