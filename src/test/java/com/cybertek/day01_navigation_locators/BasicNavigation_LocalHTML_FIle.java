package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_FIle {

    public static void main(String[] args) {

        //file:///C:/Users/Yasin/OneDrive/Desktop/HTML_Class/Day2.html
        //set up chrome driver , open chrome browser
        WebDriverManager.chromedriver().setup();
        //navigate to that html file using that path you copied from the browser
        WebDriver driver = new ChromeDriver();
        //file:///C:/Users/Yasin/OneDrive/Desktop/HTML_Class/Day2.html
        //You NEED TO REPLACE IT WITH
        driver.get("file:///C:/Users/Yasin/OneDrive/Desktop/HTML_Class/Day2.html");

        //close the browser
        driver.quit();




    }
}
