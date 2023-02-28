package com.bridgelabz.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_Url {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String title = driver.getTitle();
        System.out.println("the title of the page is :"+title);

        String CurrentUrl = driver.getCurrentUrl();
        System.out.println("--------------");
        System.out.println("This is a current Url :"+CurrentUrl);

        String source = driver.getPageSource();
        System.out.println("--------------");
        System.out.println("This is my page source:"+source);

        Thread.sleep(3000);

        String expected_title="google";

        if (title.contains(expected_title))
            System.out.println("Home page is Displayed");
        else
            System.out.println("Home page is not Displayed");

        driver.close();
        
    }
}
