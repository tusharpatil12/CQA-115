package com.bridgelabz.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\HP\\IdeaProjects\\CQA-115\\src\\main\\resources\\page3.html");
        Thread.sleep(1000);

        driver.findElement(By.id("t3")).sendKeys("t3 text field");

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("t2 text field");

        driver.findElement(By.id("t3"));

        Thread.sleep(1000);
    }
}