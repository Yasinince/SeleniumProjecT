package com.cybertek.day_04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingFromFakeDropDown {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        //TODO: The only wat that Select class we learned work is , if element tag is select

        //TODO: Identify the fake dropdown , it's actually a link
        WebElement fakeDropdownElm = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropdownElm.click();
        //TODO : and "select" the options -- it's actually another link
        //TODO : Identify option Google and  click on it
        driver.findElement(By.linkText("Google")).click();

        driver.quit();


    }
}
