package com.cybertek.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.nextbasecrm.com/stream/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk22@cybertekschool.com");
        Thread.sleep(2000);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        Thread.sleep(2000);
        driver.findElement(By.className("login-btn")).submit();
        Thread.sleep(2000);

        driver.quit();


    }
}
