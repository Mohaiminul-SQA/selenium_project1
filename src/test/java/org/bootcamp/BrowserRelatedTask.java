package org.bootcamp;


import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.*;

public class BrowserRelatedTask extends DriverSetup {

    @Test
    public void testBrowserTask() {

        driver.get("https://bikroy.com/");
        System.out.println(driver.getTitle());
        //window maximize,minimize & fullscreen

        driver.manage().window().fullscreen();

        driver.manage().window().minimize();

        driver.manage().window().maximize();

        driver.navigate().to("https://facebook.com/");//same tab open a new website

        driver.navigate().back();//going back to previous link

        driver.navigate().forward(); // going to the next link

        driver.navigate().refresh(); //refresh the current window

        driver.switchTo().newWindow(WindowType.TAB);//opening new tab
        driver.get("https://instagram.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);//opening new window
        driver.get("https://shikhbeshobai.com/");

        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        for (String handle : handles) {
            System.out.println(handle);
        }
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(handles.get(0));
        System.out.println(driver.getCurrentUrl());

    }
}