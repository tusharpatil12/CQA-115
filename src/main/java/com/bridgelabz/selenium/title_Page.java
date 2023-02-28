package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title_Page {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/java/");

        String expectedTitle = "Tutorials List - w3schools";
        Thread.sleep(3000);
    String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
        System.out.println("Home page is displayed");
    } else {
        System.out.println("Home page is NOT displayed");
    }
}
}
