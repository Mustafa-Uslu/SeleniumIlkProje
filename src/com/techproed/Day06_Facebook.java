package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="
        // E-posta veya Telefon Numarası" autofocus="1" aria-label="E-posta veya Telefon Numarası">
        WebElement emailKutusu = driver.findElement(By.id("email"));
        emailKutusu.sendKeys("testtechproed@gmail.com"); //// email kutusuna techproed@gmail.com yazdıralım.
        //<input type="password" class="inputtext _55r1 _6luy" name="pass" id="pass" data-testid="royal_pass"
        // placeholder="Şifre" aria-label="Şifre">
        //WebElement sifre = driver.findElement(By.id("pass"));

        WebElement sifre= driver.findElement(By.xpath("//*[@type='password']"));
        sifre.sendKeys("Test1234");//   şifre kutusuna Test1234 yazdıralım.
        sifre.submit(); // login butonunu tiklayalım
        //WebElement logIn = driver.findElement(By.cssSelector("#u_0_d")); // login butonunu bulalım
        //logIn.click();
        // Url almadan 3 sn bekletmek icin.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String loginUrl= driver.getCurrentUrl();
        System.out.println(loginUrl);
        //if(loginSayfasi.equals("https://www.facebook.com/login/")){
        if (loginUrl.equals("https://www.facebook.com/login/")) {
            System.out.println("Giris BASARISIZ ");
        }else {
            System.out.println("Giris Basarili");
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
