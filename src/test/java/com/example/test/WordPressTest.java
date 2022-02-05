package com.example.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WordPressTest extends WebDriverBase {

    @Test
    public void enter() throws InterruptedException {

        getWebDriver().get("http://localhost:8080/wp-login.php/");
        WebElement loginField = getWebDriver().findElement(By.id("user_login"));
        loginField.sendKeys("admin");
        WebElement passwordField = getWebDriver().findElement(By.id("user_pass"));
        passwordField.sendKeys("admin");
        WebElement button = getWebDriver().findElement(By.id("wp-submit"));
        button.click();
        Thread.sleep(1000);
        WebElement successes = getWebDriver().findElement(By.linkText("Привет, admin"));

        assertTrue(successes.isDisplayed());


    }


}
