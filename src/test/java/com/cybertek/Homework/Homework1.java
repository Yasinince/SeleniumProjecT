package com.cybertek.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Homework1 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("selenium");
        WebElement searchBtn = driver.findElement(By.name("btnK"));
        Thread.sleep(3000);
        searchBtn.submit();
        WebElement about = driver.findElement(By.id("result-stats"));
        System.out.println("about.getText() = " + about.getText());
        List<WebElement> selenium = driver.findElements(By.partialLinkText("selenium"));
        System.out.println("Selenium size  : " + selenium.size());
        System.out.println("First text : " + selenium.get(1).getText());
        System.out.println("Last text : " + selenium.get(selenium.size() - 1).getText());

        for (WebElement each : selenium) {
            System.out.println("each :" + each.getText());

        }


    }

}
/*
1. navigate to https://google.com
2. search for `selenium`
3. click google search button
4. identify the div that hold the search result count on next page `About 95,900,000 results (0.58 seconds)`
5. get the text of that element
6. Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
7. get all the link that contain text `selenium` into a List<WebElement>
8. get the count
9. get the first one text
10. get the last one text
11. iterate over the list and print the text of each link
12. watch the short to learn more about `findElement(By.tagName("tag here"))`
13. watch the short to learn more about `element.getAttribute("attribute goes here")`
 */