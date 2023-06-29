package org.example;
//Package Imports

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//Main Class
public class Main {
    public static void main(String[] args) {
        try {

//          Change web driver according to your browser. Here Chrome browser has been used.
            WebDriver driver = new ChromeDriver();

//          Launching the website
            driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

//          Maximizing window size
            driver.manage().window().maximize();

//          Clicking on "alert" box
            driver.findElement(By.name("alert")).click();

//          Alert class object to handle all alert methods
            Alert alert = driver.switchTo().alert();

//          Switching to "alert" box and accepting "alert" box pop-up
            alert.accept();

//          Clicking on "confirmation" box
            driver.findElement(By.name("confirmation")).click();

//          Fetching the text from the "confirmation" alert pop-up
            String confirmationBoxMessage = alert.getText();

//          Dismissing the "confirmation" alert pop-up
            alert.dismiss();

//          Printing the stored "confirmation" pop-up box message
            System.out.println(confirmationBoxMessage);

//          Clicking on the "prompt" button
            driver.findElement(By.name("prompt")).click();

//          Entering value inside the "prompt" alert pop-up
            alert.sendKeys(confirmationBoxMessage);

//          Accepting the "prompt" alert pop-up
            alert.accept();

//          Performing actions on data
            Actions action = new Actions(driver);

//          Double-clicking on "Double Click Me" box
            action.doubleClick(driver.findElement(By.id("double-click"))).perform();

//          Getting the text from the "Double Click Me" alert pop-up
            String actualAlertMessage1 = alert.getText();

//          Printing the "Double Click Me" alert pop-up text
            System.out.println(actualAlertMessage1);

//          Accepting the "Double Click Me" alert pop-up
            alert.accept();

//          Hovering on "sub-menu"
            action.moveToElement(driver.findElement(By.id("sub-menu"))).perform();

//          Clicking on "Google"
            driver.findElement(By.id("link2")).click();

//          Closing all the instances of web driver
            driver.quit();

            System.out.println("\nThank You!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//        **********************THANK YOU**********************

/*CREDITS:
    Bhuvan Kohli
    bhuvan.kohli@geminisolutions.com
*/