package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement driverElement = driver.findElement(By.id("email"));

        driverElement.sendKeys("tusharpatil22700@gmail.com");

        Thread.sleep(2000);
        driverElement.clear();

        Thread.sleep(2000);

        WebElement driverElement1 = driver.findElement(By.name("email"));

        driverElement1.sendKeys("7066854089");

        Thread.sleep(2000);

//        driverElement1.clear();

        WebElement driverElement2 = driver.findElement(By.cssSelector("#pass"));

        driverElement2.sendKeys("tushar@123");

        Thread.sleep(2000);

        WebElement driverElement3 = driver.findElement(new By.ByTagName("button"));

        driverElement3.click();

        Thread.sleep(10000);

       driver.close();

//        String actualUrl = driver.getCurrentUrl();
//        if (actualUrl.contains("https://mail.google.com/mail/u/0/#inbox")) {
//            System.out.println("Home page is displayed");
//        } else {
//            System.out.println("Home page is NOT displayed");

    }

}
