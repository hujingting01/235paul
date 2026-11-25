package com.example.wikilogin.service;

import com.example.wikilogin.repository.AdminRepository;
import com.example.wikilogin.model.LoginForm;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final AdminRepository adminRepository;

    public LoginService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean authenticate(LoginForm form) {

        if (form == null) {
            return false;
        }

        return adminRepository.isValidCredential(form.getUsername(), form.getPassword());
    }
}
