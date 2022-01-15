package com.example.test;

import org.junit.jupiter.api.Test;

public class GoogleTest extends WebDriverBase {

    @Test
    public void testOpenGooglePage() {
        getWebDriver().get("https://google.com/newpath");
    }

}
