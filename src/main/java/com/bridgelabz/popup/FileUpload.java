package com.bridgelabz.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class FileUpload {
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/input[2]")).sendKeys();


    }
}
