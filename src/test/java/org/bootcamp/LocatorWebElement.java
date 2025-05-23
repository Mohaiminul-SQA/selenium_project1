package org.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorWebElement extends DriverSetup{

    @Test
    public void locate() {
        try {
            driver.get("https://google.com");
            WebElement searchElement;
//            searchElement= driver.findElement(By.id("APjFqb")); //locate by id
//            searchElement = driver.findElement(By.name("q")); //locate by name
//            searchElement = driver.findElement(By.tagName("textarea")); //locate by tag name
            searchElement = driver.findElement(By.className("gLFyf")); // locate by className
            searchElement.sendKeys("Hello! Google");
            Thread.sleep(3000);
            driver.manage().window().maximize();
            driver.findElement(By.linkText("Gmail")).click();
            Thread.sleep(3000);
            driver.navigate().back();
            driver.findElement(By.partialLinkText("কীভাবে কাজ করে")).click();
            Thread.sleep(3000);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
