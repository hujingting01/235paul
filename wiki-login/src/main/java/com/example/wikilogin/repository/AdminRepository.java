package com.example.wikilogin.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository {

    private static final String VALID_USERNAME = "jingting";
    private static final String VALID_PASSWORD = "123";

    private final Map<String, String> users = new HashMap<>();

    public AdminRepository() {
        users.put(VALID_USERNAME, VALID_PASSWORD);
        users.put("admin", "admin123");
        users.put("wiki", "wiki2024");
        users.put("jingting", "123");
    }

    public String getValidUsername() {
        return VALID_USERNAME;
    }

    public String getValidPassword() {
        return VALID_PASSWORD;
    }

    public boolean isValidCredential(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        String storedPassword = users.get(username.trim());
        return storedPassword != null && storedPassword.equals(password);
    }
}
