package com.project.invitation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvitationController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("data","hello");
        return "invitation";
    }
    @GetMapping("invitation")
    public String invitation(Model model) {
        model.addAttribute("data","hello");
        return "invitation";
    }

    @GetMapping("gallery")
    public String gallery(Model model) {
        model.addAttribute("data","hello");
        return "gallery";
    }

}
