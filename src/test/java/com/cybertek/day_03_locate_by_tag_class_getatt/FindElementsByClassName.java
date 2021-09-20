package com.cybertek.day_03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsByClassName {

    public static void main(String[] args) {

        // open chrome and navigate to practice site
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify this element using it's  class attribute
        //<span class = "h1y"> Test Automation Practice </span>

        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());


        //<li class = "list-group-item"> .... </li>
        //identify first li element with class name list-group item
        WebElement firstListItem = driver.findElement(By.className("list-group-item"));
        System.out.println("firstListItem.getText() = " + firstListItem.getText());

        //identify all li elements with class name list-group-item
        List<WebElement> allListItem = driver.findElements(By.className("list-group-item"));
        System.out.println("allListItem.size() = " + allListItem.size());

        for (WebElement eachLink : allListItem) {
            System.out.println("eachLink.getText() = " + eachLink.getText());

        }


        driver.quit();



    }
}
