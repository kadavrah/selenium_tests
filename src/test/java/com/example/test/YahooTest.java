package com.example.test;

import org.junit.jupiter.api.Test;

public class YahooTest extends WebDriverBase {

    @Test
    public void testOpenPage() {
        getWebDriver().get("https://yahoo.com");
    }
}
