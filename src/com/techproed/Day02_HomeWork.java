package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_HomeWork {
    public static void main(String[] args) {
        /*
        1. Yeni bir class oluşturun :Homework
        2. ChromeDriver’ı kullanarak facebook’a gidin ve sayfa başlığının(Page Title) “facebook” olup olmadığını doğrulayın,
           Değilse, doğru başlığı(Actual title) yazdırın.
        3. Sayfa URL’sinin facebook içerip içermediğini(contains), Değilse doğru URL’yi(Actual url) yazdırın.
        4. Ardından Navigate to https://www.walmart.com/
        5. Walmart sayfa başlığının “Walmart.com” içerip içermediğini(contains) doğrulayın
        6. Navigate back to facebook
        7. Sayfayı yenileyin(refresh)
        8. Maximize the window
        9. Close the browser (bearbeitet)
         */
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        String faceBaslik = driver.getTitle();
        String beklenen = driver.getCurrentUrl();
              // if (faceBaslik.toLowerCase().contains("facebook")) {
        if (faceBaslik.equals("facebook")) {
            System.out.println("PASS, facebook kelimesi iceriyor.");
        } else {
            System.out.println(faceBaslik);
            if (beklenen.toLowerCase().contains("facebook")) {
                System.out.println("facebook kelimesi iceriyor.");
            } else {
                System.out.println(driver.getCurrentUrl()); //yada System.out.println(beklenen);
            }
            driver.navigate().to("https://www.walmart.com");

            String walBaslik = driver.getTitle();
            if (walBaslik.toLowerCase().contains("Walmart.com")) {
                System.out.println("Walmart.com iceriyor.");
            } else {
                System.out.println(walBaslik);  //yada System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
            }
            driver.navigate().back();
            driver.navigate().refresh();

            driver.quit();

        }
    }
}
