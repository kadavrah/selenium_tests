package com.example.test;

import org.junit.jupiter.api.Test;

public class YandexTest extends WebDriverBase {

    @Test
    public void testOpenYandexPage() {
        getWebDriver().get("https://ya.ru");
    }

}
