package com.bridgelabz.selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Location {
    public static void main (String[] args){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.meesho.com/");

        String title = driver.getTitle();
        System.out.println("The title of the page is :"+title);

    }
}
