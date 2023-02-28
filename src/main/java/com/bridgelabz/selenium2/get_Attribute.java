package com.bridgelabz.selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_Attribute {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));

        String tooltipText = Checkbox.getAttribute("title");
        System.out.println(tooltipText);
        driver.close();
    }
}
