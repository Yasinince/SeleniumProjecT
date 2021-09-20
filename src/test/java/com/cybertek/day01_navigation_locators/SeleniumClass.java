package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

    public static void main(String[] args) {

        //1.setup cgrome driver using webdriver manager
        //so selenium can send interation request
        WebDriverManager.chromedriver().setup();
        //2. create webdriver instance using Chrome Driver object
        WebDriver driver = new ChromeDriver();
        //3. navigate to https://google.com
        driver.get("https://google.com");

    }
}