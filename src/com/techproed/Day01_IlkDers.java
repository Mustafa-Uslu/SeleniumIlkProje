package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) throws InterruptedException {
        // Java Projemize ,Chromedriver'i tanittik.
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        // selenium ile ilgili ilk kodumuz.
        // webDriver nesnesi oluşturarak, chrome driverı kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();
        // driver'ımıza google.com'a gitmesini söyledik.
        webDriver.get("https://google.com");
        //driverımızda açık olan pencereyi kapatır.
        //webDriver.close();
        //driverımı komple kapatıyor
        //webDriver.quit();

        webDriver.get("https://www.hurriyet.com.tr");
        //Thread.sleep(1000);
        webDriver.get("https://www.amazon.com");
        Thread.sleep(2000);
        //webDriver.close();

        webDriver.navigate().to("https://www.google.com");
        Thread.sleep(200);
        webDriver.quit();
    }



}
