package com.cersocode.integrador_web.controller;

import com.cersocode.integrador_web.model.Solicitud;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author vicec
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        Solicitud solicitud = new Solicitud();
        model.addAttribute("solicitud", solicitud);
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("solicitud") Solicitud solicitud, 
            Model model) {
        model.addAttribute("mensaje", solicitud);
        return "paginaDestino";
    }

}
