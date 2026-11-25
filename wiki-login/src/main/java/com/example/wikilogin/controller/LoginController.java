package com.example.wikilogin.controller;

import com.example.wikilogin.model.LoginForm;
import com.example.wikilogin.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping({"/", "/login"})
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute LoginForm loginForm, Model model) {

        boolean authenticated = loginService.authenticate(loginForm);

        if (authenticated) {

            model.addAttribute("username", loginForm.getUsername());
            return "welcome";
        }

        model.addAttribute("error", "Invalid username or password. Please try again.");
        model.addAttribute("username", loginForm.getUsername());
        return "error";
    }
}
