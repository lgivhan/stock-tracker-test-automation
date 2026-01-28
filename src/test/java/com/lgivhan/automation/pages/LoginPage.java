package com.lgivhan.automation.pages;

import org.springframework.stereotype.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import jakarta.annotation.PostConstruct;

@Component
public class LoginPage extends BasePage {

    // Locators
    @FindBy(name = "email")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    // Connects @FindBy to the driver
    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToApp() {
        driver.get("https://lgivhan.github.io/stock-tracker/");
    }
    public void login(String user, String pass) {
        usernameField.sendKeys(user);
        passwordField.sendKeys(pass);
        loginButton.click();
    }
}
