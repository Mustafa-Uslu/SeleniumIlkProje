package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");  //web sayfamiza gittik

        WebElement singInLink = driver.findElement(By.linkText("Sign in"));
        singInLink.click();
        //WebElement home = driver.findElement(By.linkText("Home")); //bulamadi Home yazisina dev kod eklemis.
        //<a class="nav-item nav-link active" data-test="home" href="/">
        //Home
        //       <span class="sr-only">(current)</span>
        //    </a>
        // home.click();
        WebElement homeLink = driver.findElement(By.partialLinkText("Home")); //burada linkin icinde gecen bir parcayi(Home /Om/H) almamiz yeterlidir
        homeLink.click();

        driver.quit();
    }
}
