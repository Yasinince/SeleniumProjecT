package com.cybertek.Homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");

        String result = driver.getTitle();
        String title = "`Zero - Personal Banking - Loans - Credit Cards`";
        if(result.equals(title)){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
        Thread.sleep(2000);
        WebElement signingBtn = driver.findElement(By.id("signin_button"));
        signingBtn.click();
        Thread.sleep(3000);

        String result2 = driver.getTitle();
        String title2 = "Zero- Log in";
        if(result.equals(title2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        WebElement userNameBox = driver.findElement(By.id("user_login"));
        userNameBox.sendKeys("username");
        WebElement passwordBox = driver.findElement(By.id("user_password"));
        passwordBox.sendKeys("password");
        WebElement submitBtn = driver.findElement(By.name("submit"));
        submitBtn.submit();
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        Thread.sleep(2000);

        String result3= driver.getTitle();
        String title3 = "Zero - Account Summary";
        if (result3.equals(title3)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



        Thread.sleep(3000);
        driver.quit();

    }

}
 /*
        1. open chrome and navigate to http://zero.webappsecurity.com/
        2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        3. click on `signing button`
        4. verify the title is "Zero- Log in"
        5. enter text as "username" into username box
        6. enter text "password" into password box
        7. submit by clicking login button
        8. verify you are at "Zero - Account Summary" page by checking title
        9. now use your imagination to play around here and explore , automate within the capacity we already have so far.
         */