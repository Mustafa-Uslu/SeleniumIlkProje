package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement yazma = driver.findElement(By.name("q")); // sign in butonunu buluyoruz. // name="commit"
        yazma.sendKeys("city bike");
        yazma.submit();

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Shopping"));
        alisverisLinki.click();

        driver.quit();
    }
}
