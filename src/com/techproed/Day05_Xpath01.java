package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailKutusu= driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement passKutusu= driver.findElement(By.xpath("//input[@type='password']"));
        passKutusu.sendKeys("Test1234!");

        WebElement singButonu=driver.findElement(By.xpath("//input[@name='commit']"));
        singButonu.submit();
        /*
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        */
        driver.quit();
    }
}
