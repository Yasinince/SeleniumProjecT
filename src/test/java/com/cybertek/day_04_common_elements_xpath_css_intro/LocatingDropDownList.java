package com.cybertek.day_04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDownList {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       driver.get("http://practice.cybertekschool.com/dropdown");

       //TODO : identify the year dropdown
        WebElement yearDropdownElm = driver.findElement(By.id("year"));

       //TODO : Wrap it up using Select class so we can use easy methods
        Select yearSelectObj = new Select(yearDropdownElm);

       //TODO : select items in 3 different ways
        yearSelectObj.selectByIndex(2);
        //TODO : Select item with value attribute 2019
        yearSelectObj.selectByValue("1996");
        //TODO: Select item with visible text
        yearSelectObj.selectByVisibleText("1990");
        //TODO: identify the month dropdown
        WebElement monthDropdownElm = driver.findElement(By.id("month"));
        //Todo: Wrap it up using Select class so we can use easy methods
        Select monthSelectObj = new Select(monthDropdownElm);
        //TODO: Select items in 3 different ways

        monthSelectObj.selectByIndex(4);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");

        driver.quit();



    }
}
