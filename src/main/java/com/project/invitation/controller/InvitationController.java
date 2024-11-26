package com.project.invitation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvitationController {

    @GetMapping("invitation")
    public String invitation(Model model) {
        model.addAttribute("data","hello");
        return "invitation";
    }

}
