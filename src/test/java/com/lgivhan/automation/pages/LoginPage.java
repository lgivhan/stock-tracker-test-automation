package com.lgivhan.automation.pages;

import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    public void navigateToApp() {
        driver.get("https://lgivhan.github.io/stock-tracker/");
    }
    public void login(String u, String p) {
        System.out.println("Browser is open and at the URL");
    }
}
