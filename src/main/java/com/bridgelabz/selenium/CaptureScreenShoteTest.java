package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShoteTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("7066854089");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File soursefile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("./screenshot/"+System.currentTimeMillis() + "screenshot.png");


        try {
            FileHandler.copy(soursefile,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(2000);
        driver.close();

    }

    }
