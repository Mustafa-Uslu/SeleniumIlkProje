package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com"); // google.com'a gittik
        webDriver.navigate().to("http://techproed.com");

        String sayfaTitle = webDriver.getTitle();
        String sayfaUrl = webDriver.getCurrentUrl();
        // sout+enter =syso
        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);
        webDriver.quit();
    }
}
