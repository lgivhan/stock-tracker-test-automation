package com.lgivhan.automation.stepdefs;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import com.lgivhan.automation.pages.LoginPage;

public class StockStepDefinitions {

    @Autowired
    private LoginPage loginPage;

    @Given("the user is logged into the Stock Tracker application")
    public void userIsLoggedIn() {
        // Tell Java to look at the POM
        loginPage.navigateToApp();

        // Tell selenium to perform login
        loginPage.login("myUserName", "mySecurityPassword");

        System.out.println("Log in flow successful!");
    }
}
