package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("#email.inputtext._55r1")).sendKeys("7066854089");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[id=\"pass\"]")).sendKeys("tushar@123");
            Thread.sleep(2000);

            driver.findElement(By.name("login")).click();
            Thread.sleep(2000);

        }

}