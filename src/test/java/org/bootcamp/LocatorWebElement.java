package org.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocatorWebElement extends DriverSetup{

    @Test
    public void locate() {
        try {
            driver.get("https://google.com");
            WebElement searchElement,searchArea,searchArea2;
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
            driver.navigate().back();

            //xpath expression
//            searchArea = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
//            searchArea.sendKeys("textarea found successfully");
//            Thread.sleep(3000);
//            searchArea.clear();
//            Thread.sleep(3000);

            //css selector
//            searchArea2 = driver.findElement(By.cssSelector("textarea[class='gLFyf']"));
//            searchArea2.sendKeys("textarea found again successfully");
//            Thread.sleep(3000);

            //locate child element
            List<WebElement> searchElements = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
            for (WebElement element : searchElements) {
                System.out.println(element.getText());
            }


        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
