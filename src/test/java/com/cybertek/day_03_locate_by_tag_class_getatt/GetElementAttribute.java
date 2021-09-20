package com.cybertek.day_03_locate_by_tag_class_getatt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAttribute {

    public static void main(String[] args) {

        // set up chrome driver and open chrome
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        //get the first link on the page and get href attribute
        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));

        //get text practice
        System.out.println("firstLink.getText() = " + firstLink.getText());

        //get any attribute of identified element , in this case href
        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        //navigate to google.com and identify the searchbox and get couple attributes value

        driver.navigate().to("https://google.com");
        WebElement seachBox = driver.findElement(By.name("q"));
        seachBox.sendKeys("Selenium");

        //get the class attribute
        System.out.println("seachBox.getAttribute(\"class\") = " + seachBox.getAttribute("class"));
        //maxlength

        System.out.println("seachBox.getAttribute(\"maxlength\") = " + seachBox.getAttribute("maxlength"));

        //title

        System.out.println("seachBox.getAttribute(\"title\") = " + seachBox.getAttribute("title"));

        //autocapitalize

        System.out.println("seachBox.getAttribute(\"autocapitalize\") = " + seachBox.getAttribute("autocapitalize"));

        //spellcheck

        System.out.println("seachBox.getAttribute(\"spellcheck\") = " + seachBox.getAttribute("spellcheck"));

        //role

        System.out.println("seachBox.getAttribute(\"role\") = " + seachBox.getAttribute("role"));

        //using value attribute of input text box tp extarct the text inside

        System.out.println("seachBox.getAttribute(\"value\") = " + seachBox.getAttribute("value"));


        //Homework
        //Identfify the google search button and get below attributes
        //class , type , value,


        driver.quit();


    }

}
