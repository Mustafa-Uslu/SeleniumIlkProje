package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    // 1 - youtube.com'a gidelim.
    // 2 - title (sayfa başlığı), video kelimesini içeriyor mu bakalım.
    // 3 - driverı kapatalım.

    public static void main(String[] args) {
        // Java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        // youtube.com'a gidelim.
        webDriver.get("http://www.youtube.com");
        // sayfanın title(yani başlığını) alalım.
        String youtubeTitle = webDriver.getTitle();
        if (youtubeTitle.toLowerCase().contains("video")){
            System.out.println("video kelimesi iceriyor"+ youtubeTitle);
            }else{
            System.out.println("video kelimesi icermiyor"+ youtubeTitle);
        }
        webDriver.quit();

    }
}
