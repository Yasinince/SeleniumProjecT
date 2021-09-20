package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {

    public static void main(String[] args) throws InterruptedException {


        // set up chrome driver
        WebDriverManager.chromedriver().setup();
        //navigate to that html file using that path you copied from the browser
        WebDriver driver = new ChromeDriver();
        // navigate to google
        driver.navigate().to("https://google.com");
        //search for amazon
        WebElement searchBtn = driver.findElement(By.name("q"));
        searchBtn.sendKeys("amazon");
        searchBtn.submit();
        //put correct username and password
        WebElement amazonClick =  driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a"));
        amazonClick.click();

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Pro soccer cleats");
        searchBox.submit();

        WebElement soccerCleats = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[14]/div/span/div/div/div[3]/div[1]/h2"));
        soccerCleats.submit();

        Thread.sleep(2500);

        driver.quit();




    }
}
