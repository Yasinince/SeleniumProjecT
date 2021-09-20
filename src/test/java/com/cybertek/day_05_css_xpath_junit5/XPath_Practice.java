package com.cybertek.day_05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Practice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://practice.cybertekschool.com/forgot_password");

        // locate 2 elements using xpath
        // locate header element using xpath
        WebElement forgetPasswordHeader = driver.findElement(By.xpath("//h2[ text() = 'Forgot Password']"));
        System.out.println("forgetPasswordHeader.getText() = " + forgetPasswordHeader.getText());

        // locate input box element using xpath
        WebElement emailBox = driver.findElement(By.xpath("//input[ @name='email' and @type='text']")) ;
        emailBox.sendKeys("someone@somewhere.com");


        // locate button element using xpath
        WebElement retrieveBtn = driver.findElement(By.xpath("//button[@id='form_submit' and @class='radius']"));
        retrieveBtn.click();

        String confirmationLocatorStr = "//h4[text()=\"Your e-mail's been sent!\"]" ;
        System.out.println("confirmationLocatorStr = " + confirmationLocatorStr);

        WebElement confirmationMsg = driver.findElement(By.xpath( confirmationLocatorStr ) ) ;


        driver.quit();




    }

}
