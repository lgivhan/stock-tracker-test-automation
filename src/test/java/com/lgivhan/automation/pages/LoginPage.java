package com.lgivhan.automation.pages;

import org.springframework.stereotype.Component;

@Component
public class LoginPage {
    public void navigateToApp() { System.out.println("Navigating..."); }
    public void login(String u, String p) { System.out.println("Logging in..."); }
}
