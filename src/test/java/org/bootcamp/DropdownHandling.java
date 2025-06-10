package org.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownHandling extends DriverSetup {
    @Test
    public void dropDownhandling() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dropdownElement = driver.findElement(By.id("dropdown-class-example"));
        Select selectTag = new Select(dropdownElement);
        selectTag.selectByVisibleText("Option1");
        Thread.sleep(3000);

    }

}
