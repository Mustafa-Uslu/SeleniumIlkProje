package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Eksersiz {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.ozgurherkul.org");
        Thread.sleep(1000);

        driver.navigate().to("http://www.samanyoluhaber.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();
        driver.navigate().back();

        String sayfaTitle =driver.getTitle();
        String expectedTitle ="herkul";
        String sayfaUrl =driver.getCurrentUrl();
        String expectedUrl= "www.ozgurherkul.org";

        if (sayfaTitle.equals(expectedTitle)) {
            System.out.println("PASS");
            System.out.println("Sayfa Basligi : "+ sayfaTitle);
        }else {
            System.out.println("Fail");
            System.out.println("Sayfa (URL) Adresi: "+sayfaUrl);
            System.out.println("Exception (URL) Adres: "+expectedUrl);
        }
        driver.quit();
    }

}
