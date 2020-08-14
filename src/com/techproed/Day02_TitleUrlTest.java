package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.youtube.com");
        String youtubeTitle = webDriver.getTitle();
        if (youtubeTitle.toLowerCase().contains("video")){
            System.out.println("video kelimesi iceriyor"+ youtubeTitle);
            }else{
            System.out.println("video kelimesi icermiyor"+ youtubeTitle);
        }
        webDriver.quit();
    }
}
