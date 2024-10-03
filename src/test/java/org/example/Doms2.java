package org.example;

import io.qameta.allure.internal.shadowed.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Doms2 extends BaseTest {

    @Test(groups = "Regression")
    public void test3() throws InterruptedException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.flipkart.com");
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),\"Payments\")]")).click();
    }
}
