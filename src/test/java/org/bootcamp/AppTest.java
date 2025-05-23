package org.bootcamp;

import org.testng.annotations.Test;

import java.sql.Driver;

/**
 * Unit test for simple App.
 */
public class AppTest extends DriverSetup {
    @Test
    public void testWebLoad() {
        driver.get("https://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testLogin() {
        driver.get("https://google.com/");
        System.out.println(driver.getTitle());
    }
}
