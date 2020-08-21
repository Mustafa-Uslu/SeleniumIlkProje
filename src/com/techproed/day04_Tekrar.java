package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day04_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.navigate().to("http://www.sanliurfa.com.tr");
        driver.navigate().back();
        String aBaslik =driver.getTitle();
        String eBaslik ="Google.com";
        if (aBaslik.equals(eBaslik)) {
            System.out.println("Title PASS");
        }else{
            System.out.println("Title FAIL");
            System.out.println("Actual Title: "+aBaslik);
            System.out.println("Exception Title: "+eBaslik);
        }
        String aUrl =driver.getCurrentUrl();
        String eUrl ="www.Google.com";
        if (aUrl.equals(eUrl)) {
            System.out.println("Url PASS");
        }else {
            System.out.println("Url FAIL");
            System.out.println("Actual Url: "+aUrl);
            System.out.println("Exception Url: "+eUrl);
        }

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("computer");
        search.submit();

        WebElement gorsel =driver.findElement(By.partialLinkText("Bilder"));
        gorsel.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
