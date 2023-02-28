package com.bridgelabz.JavaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrolePageTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {

            js.executeScript("window.scrollBy(0, 100)");

            Thread.sleep(3000);
        }

        for (int i = 0; i < 5; i++) {

            js.executeScript("window.scrollBy(0, -100)");

            Thread.sleep(3000);

            driver.close();
        }


    }
}
