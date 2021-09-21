package com.cybertek.Homework;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Homework4 extends TestBase {

    /**
     * 1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
     * 2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
     * 3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
     * 4. It will open the link in new tab
     * 5. Click on the Dropdown Link again to open it.
     * 6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
     * 7. It will open the link in another windows.
     * 8. Repeat the same process for Facebook
     * 9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
     * 10. Optionally , if the title contains Facebook, Close the window|tab.
     * 11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
     * "Try Prime" link , Verify it isDisplayed.
     * 12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
     * 13. These exercise can be done separately instead of switching to the window, do your best judgement to do them together or separately.
     */

    @Test
    public void notSleepingYet(){
        //1.navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
        driver.get("http://practice.cybertekschool.com/dropdown");
        String currentWindow =  driver.getWindowHandle();
        BrowserUtil.waitFor(3);
        //2.Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
        WebElement lastDropDown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        lastDropDown.click();
        //3.Hold down to (COMMAND on mac CONTROL on windows) and Click on Google Link then release it.
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[.='Google']"))).click().perform();
        BrowserUtil.waitFor(2);
        //4.It will open the link in new tab
        //5. Click on the Dropdown Link again to open it.
        //* 6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
        //* 7. It will open the link in another windows.
        lastDropDown.click();
        actions.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[.='Amazon']"))).click().perform();
        BrowserUtil.waitFor(2);
        //* 8. Repeat the same process for Facebook
        lastDropDown.click();
        actions.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[.='Facebook']"))).click().perform();
        BrowserUtil.waitFor(2);
        //9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
        Set<String> handles = driver.getWindowHandles();
        for (String eachHandle : handles) {
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
           // * 10. Optionally , if the title contains Facebook, Close the window|tab.
           if (driver.getTitle().contains("Facebook")){
               driver.close();
               driver.switchTo().window(currentWindow);
           }


        //11. Optionally, if the title contains Amazon ,
        // Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
        //     * "Try Prime" link , Verify it isDisplayed.
        if (driver.getTitle().contains("Amazon")){
            actions.moveToElement(driver.findElement(By.xpath("//span[.='Prime']"))).perform();

       WebElement  displayedMsg = driver.findElement(By.xpath("//*[@id=\"nav-flyout-prime\"]/div[2]/div[1]/div[4]/a"));
            String expectedMsg = "Try Prime";
            String actualTitle = displayedMsg.getText();

            assertEquals(expectedMsg,actualTitle);


        }

    }
}

}
