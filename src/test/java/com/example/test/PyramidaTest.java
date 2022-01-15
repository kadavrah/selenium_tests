package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PyramidaTest extends WebDriverBase {

    @Test
    public void testPromoPage() {
        getWebDriver().get("https://pyramida.info/");
        WebElement promoButton = getWebDriver().findElement(By.linkText("Акции"));
        promoButton.click();
        WebElement broodcamst = getWebDriver().findElement(By.className("broodcamst"));
        WebElement promoText = broodcamst.findElement(By.tagName("span"));
        WebElement searchForm = getWebDriver().findElement((By.className("search_form")));
        searchForm.sendKeys("где бля");
        WebElement result = getWebDriver().findElement(By.id("result"));

        Assertions.assertEquals("Упс... Сегодня у нас нечего Вам предложить в данной категории.", result.getText());
        Assertions.assertEquals("Товары со скидками", promoText.getText());
    }
}
