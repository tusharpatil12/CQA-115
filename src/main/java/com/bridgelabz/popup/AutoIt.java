package com.bridgelabz.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoIt {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Users\\HP\\Desktop\\ChromeSetup (1).exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.naukri.com/");



    }
}
