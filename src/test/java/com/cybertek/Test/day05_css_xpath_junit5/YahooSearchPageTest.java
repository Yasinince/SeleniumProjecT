package com.cybertek.Test.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchPageTest {

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

    // write 2 tests :
    // testYahooSearchHomePageTitle
    //
    //    test when you navigate to yahoo search page
    //        the title should be "Yahoo Search - Web Search"

    @Test
    public void testYahooSearchHomePageTitle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://search.yahoo.com/");

        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        //quit the browser here , because we already saved the title
        driver.quit();
        //do static import, so you can do this
        //import static org.junit.jupiter.api.Assertions.x;
        assertEquals(expectedTitle, actualTitle);


    }


    // test method name : testYahooSearchResultPageTitle
    // test navigate to yahoo page
    // and search for Selenium
    // the page title should start with selenium
    @Test
    public void testYahooSearchResultPageTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

      WebElement searchBtn = driver.findElement(By.cssSelector("#yschsp"));
      searchBtn.sendKeys("Selenium" + Keys.ENTER);


      String expectedTitle = "Selenium";

      driver.quit();

      assertTrue(driver.getTitle().startsWith(expectedTitle));


    }




}
