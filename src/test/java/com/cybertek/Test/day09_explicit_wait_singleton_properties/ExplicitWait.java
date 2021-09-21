package com.cybertek.Test.day09_explicit_wait_singleton_properties;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends TestBase {

    @Test
    public void testWaitForTitle(){

        //1. navigate to http://practice.cybertekschool.com/dynamic_loading
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();
        //3. The title will show loading... until certain time ,
        // we want to wait until the title value become "Dynamic Title"
        //this is how we create WebDriverWair object with driver and max time to wait
        WebDriverWait wait =new WebDriverWait(driver, 6);
        //then we use until method that accept expected conditions
        //ExpectedConditions helper class has a lot of pre-wiretten conditions
        // for common scenarios, so we dont hace to build our own
        // in this case we
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        System.out.println("End");


    }




}
