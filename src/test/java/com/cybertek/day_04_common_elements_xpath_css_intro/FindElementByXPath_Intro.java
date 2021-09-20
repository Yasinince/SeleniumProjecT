package com.cybertek.day_04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXPath_Intro {

    public static void main(String[] args) {

        ///html/body/div/div[2]/div/div/div/h1/span
        //Xpath can be used to navigate through elements and attributes in a html document.
        //This is known as absolute xpath,
        //Starting from root element (html) till the element you are looking for
        // //h1/span this is knows as relative xpath , it starts with double forward slas //

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        //using above full xpath to identify the element and get the text
        WebElement headerSpan = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        // use relative path
        // h1/span : start looking for the element with h1 whoever parents or grandparents are
        // find direct child with span tag
        WebElement headerSpan2 = driver.findElement(By.xpath("//h1/span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        //providing attributes in xpath
        // elementTag[@attributeName='attribute value']
        //input[@name='checkbox1']
        // if you have more than one
        // elementTag[@attributeName='attribute value' and @attribute2Name = 'attribute2 value' ]
        ////input[@name='checkbox1'  and @type='checkbox']
        //you have option to provide index
        // someElement[indexGoesHere]
        //you can also provide use text() xpath function
        // elementTag[test()='some text value goes here ']

        // click on checkboxes link to go to checkbox page
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

        //identify header , 1st checkbox using xpath
        WebElement header = driver.findElement(By.xpath("//h3[ text() = 'Checkboxes' ] "));
        System.out.println("header.getText() = " + header.getText());

        WebElement firstCheckBox = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("firstCheckBox.isSelected() = " + firstCheckBox.isSelected());


        driver.quit();


    }
}
