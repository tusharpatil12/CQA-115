package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_url {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = ("https://www.w3schools.com/java/");
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Home page is displayed");
        } else {
            System.out.println("Home page is NOT displayed");
        }
    }
}
