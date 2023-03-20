package com.bridgelabz.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HP/IdeaProjects/CQA-115/src/main/resources/test.html");

        JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
        Thread.sleep(3000);
        //driver.findElement(By.id("Username")).sendKeys("Username");
        javaScriptExecutor.executeScript("document.getElementById('username').value='test'");
        Thread.sleep(3000);
        //driver.findElement(By.id("password")).sendKeys("pass");
        javaScriptExecutor.executeScript("document.getElementById('password').value='Password'");
        Thread.sleep(5000);
        driver.close();

    }

}
