package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");  //web sayfamiza gittik
        WebElement signInLink = driver.findElement(By.id("sign-in")); // webelementimize tıkladık.
        signInLink.click();
        WebElement eMaılKutusu = driver.findElement(By.className("form-control")); // <input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        eMaılKutusu.sendKeys("testtechproed@gmail.com");
        WebElement eMailPass = driver.findElement(By.id("session_password"));//<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        eMailPass.sendKeys("Test1234!"); //sifre ekliyoruz sifre kutusuna,.
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click(); //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">

        driver.quit();
    }
}
