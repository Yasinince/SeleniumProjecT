package com.cybertek.day_04_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByCssSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");


        // TODO : Identify searchbox using css selector

        //<input type = "text" class= "sbq" id="yschsp" name ="p" value=""  role= "combobox">


        //try different wat , by id , by name
        WebElement searchBox = driver.findElement(By.cssSelector("#yschsp"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[name='p"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[id='yschsp']"));
        //WebElement searchBox = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBox.sendKeys("CSS SELECTOR");
        //<button id ="sbq-clear" type="button" class="sbq-x">
        //                         <span class ="sprite></span>
        //</button>
        //the x icon
        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();

        searchBox.sendKeys("XPATH");
        //identify the search icon using css selector : span[title ='Search']
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']"));
        searchIcon.click();

        driver.quit();




    }
}
