package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PyramidaTest extends WebDriverBase {

    @Test
    public void testPromoPage() {
        getWebDriver().get("https://pyramida.info/");
        WebElement promoButton = getWebDriver().findElement(By.linkText("Акции"));
        promoButton.click();
        WebElement broodcamst = getWebDriver().findElement(By.className("broodcamst"));
        WebElement promoText = broodcamst.findElement(By.tagName("span"));
        WebElement searchForm = getWebDriver().findElement((By.className("search_form")));
        searchForm.sendKeys("где");
        WebElement result = getWebDriver().findElement(By.xpath("//*[@id=\"application_root\"]/div/div/div[1]/div/div[3]/div[2]"));

        Assertions.assertEquals("Упс... Сегодня у нас нечего Вам предложить в данной категории.", result.getText());
        Assertions.assertEquals("Товары со скидками", promoText.getText());
    }

    @Test
    public void testBasket() throws InterruptedException {
        getWebDriver().get("https://pyramida.info/");
        WebElement dl = getWebDriver().findElement(By.className("one_item_block"));
        Actions actionProvider = new Actions(getWebDriver());
        actionProvider.moveToElement(dl).build().perform();
        Thread.sleep(1000);
        WebElement dl2 =getWebDriver().findElement(By.className("btn-success"));
        dl2.click();
        getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Продолжить просмотр']")));//ожидание появления элемента
        WebElement dl3 = getWebDriver().findElement(By.xpath("//span[text()='Продолжить просмотр']"));
        dl3.click();
        Thread.sleep(1000);
        WebElement dl4 = getWebDriver().findElement(By.id("basket_icon"));
        dl4.click();
        Thread.sleep(1000);
        WebElement dl5 = getWebDriver().findElement(By.xpath("//td[text()='Dying Light 2 Stay Human Стандартное издание (PS5)']"));

        assertTrue(dl5.isDisplayed());
    }
}