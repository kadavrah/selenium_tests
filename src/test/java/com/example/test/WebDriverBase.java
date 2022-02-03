package com.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBase extends Assertions {

    private WebDriver webDriver;

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupDriver() {
        webDriver = new ChromeDriver();
    }

    @AfterEach
    public void shutdown(){
        if (webDriver !=  null) {
            webDriver.close();
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
