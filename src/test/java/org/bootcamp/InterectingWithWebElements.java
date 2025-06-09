package org.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InterectingWithWebElements extends DriverSetup{

    @Test
    public void interectingWebElements() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement Title = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
        System.out.println(Title.getText());
        driver.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(3000);
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Located Successfully");
        Thread.sleep(3000);
        name.clear();
        Thread.sleep(3000);
        //getting placeholder values
        String placeholder_Value = name.getAttribute("placeholder");
        System.out.println(placeholder_Value);

    }

}
