package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class Doms1 extends BaseTest{
    @Test(groups = "Regression")
    public void test1(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");
    }

    @Test(groups = "Regression")
    public void test2() throws InterruptedException {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in");
        WebElement ele = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).build().perform();
        driver.findElement(By.xpath("(//span[contains(text(),\"Sign in\")]/parent::a)[1]")).click();
        WebElement privacy_Link = driver.findElement(By.xpath("(//a[contains(text(),\"Privacy Notice\")])[1]"));
        action.moveToElement(privacy_Link).build().perform();
        action.keyDown(Keys.CONTROL).click().build().perform();
        Thread.sleep(2000);
        Set<String> handles = driver.getWindowHandles();
        for(String handle:handles){
            System.out.println(handle);
        }
        Iterator<String> itr = handles.iterator();
        while(itr.hasNext()){
            String first = itr.next();
            String second = itr.next();
            String third = itr.next();
            driver.switchTo().window(third);
        }

        //action.contextClick(privacy_Link).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
    }
    @Test
    public void test3(){
        System.out.println("Regression");
        throw  new RuntimeException("Maths");
    }
    @Test
    public void test4(){
        System.out.println("Hello");
    }
}
