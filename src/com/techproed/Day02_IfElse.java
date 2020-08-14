package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.amazon.com");

        String sayfaBasligi = driver.getTitle();
        // contains methodu, bir yazının içerisinde bir kelime grubunun geçip geçmediğini kontrol eder.
        // contains -> bir kelimenin, bir yazı içerisinde geçip geçmediğini kontrol ediyordu.

        if (sayfaBasligi.toLowerCase().contains("Books")) {
            System.out.println("Books Kelimesi geciyor");
        } else {
            System.out.println("Books Kelimesi gecmiyor");
        }
        driver.quit();
    }
}
