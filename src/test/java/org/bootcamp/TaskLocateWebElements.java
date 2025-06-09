package org.bootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TaskLocateWebElements extends DriverSetup {

    @Test
    public void taskLocateWebElements() throws InterruptedException {
        WebElement searchArea,login,email,password;
        driver.get("https://shikhbeshobai.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        searchArea= driver.findElement(By.xpath("//a[normalize-space()='Courses']"));
        searchArea.click();
        Thread.sleep(3000);
        login = driver.findElement(By.xpath("//a[normalize-space()='Signin']"));
        login.click();
        Thread.sleep(3000);
        email = driver.findElement(By.id("email"));
        email.sendKeys("mirmohaiminul786@gmail.com");
        Thread.sleep(1000);
        password = driver.findElement(By.id("password"));
        password.sendKeys("12345765756765");
        Thread.sleep(1000);
    }

}
