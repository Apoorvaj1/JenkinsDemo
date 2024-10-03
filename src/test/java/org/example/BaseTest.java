package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class BaseTest {

    public WebDriver driver;

    @AfterTest
    public void testDown(){
        driver.quit();
    }
}
