package com.cybertek.Test.day06__junit_practice_utility_methods;

import com.cybertek.utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){
        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testYahooSearchResultPage() throws InterruptedException {
        //navigate to yahoo search and enter selenium and hit enter
        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("selenium"+ Keys.ENTER);
        // assert title starts with selenium
        Thread.sleep(1000);
        assertTrue(driver.getTitle().startsWith("selenium"));
    }


}
