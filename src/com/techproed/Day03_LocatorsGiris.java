package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
            driver.get("http://a.testaddressbook.com");  //web sayfamiza gittik
            driver.manage().window().maximize();
            // <a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
            //ilk elemanimizi bulalim.
            //sitring=webElement

        WebElement signInLink = driver.findElement(By.id("sign-in")); //webElementini bulduk
        signInLink.click(); //webElementinde sing-in 'e butonuna bastik
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
       // Thread.sleep(2000);
        WebElement eMailKutusu = driver.findElement(By.id("session_email"));
        eMailKutusu.sendKeys("testtechproed@gmail.com");
        // <input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement sifreKutusu = driver.findElement(By.id("session_password")); //sifre kutusunu buluyor
        sifreKutusu.sendKeys("Test1234!"); //sifre kutusuna sifreyi yolluyoruz

        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement singInClick =driver.findElement(By.name("commit"));
        singInClick.click();

        String baslik=driver.getTitle();
        if (baslik.equals("Address Book")) {
            System.out.println("Giris Basarili");
        }else{
            System.out.println("Giris Basarisiz");
        }
        driver.quit();

    }
}
