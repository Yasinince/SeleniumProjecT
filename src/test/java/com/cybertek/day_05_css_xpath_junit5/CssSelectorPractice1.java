package com.cybertek.day_05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorPractice1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/forgot_password");

        /**
        locate 2 elements using css selector
        input[name='email']
         form#forgot_password input[name='email']
         #forgot_password input [name='email']


         */

        Thread.sleep(1000);

        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("someone@somewhere.com");

        Thread.sleep(2000);

        /**
         * #form_submit
         * button#form_submit
         * button#form_submit.radius
         * button[id='form_submit'][class='radius']
         */

        WebElement retrieveBtn = driver.findElement(By.cssSelector("#form_submit"));
        retrieveBtn.click();

        Thread.sleep(2000);

        // identify the success message and print out the text

        /**
         * div#content > h4[name='confirmation_message']
         * div > h4[name='confirmation_message']
         * h4[name='confirmation_message']
         */


        WebElement confirmationMsg = driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        System.out.println("confirmationMsg.getText() = " + confirmationMsg.getText());

        Thread.sleep(1000);


        //close the browser
        driver.close();


    }
}
