package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_GoogleTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement aramaKutusu = driver.findElement(By.name("q")); // sign in butonunu buluyoruz. // name="commit"
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit(); // arama kutusuna enterlamis gibi olur.

        WebElement sonucSayisi = driver.findElement(By.id("result-stats"));
        System.out.println(sonucSayisi.getText());

        WebElement alisverisLinki = driver.findElement(By.partialLinkText("Shopping"));
        alisverisLinki.click();
        //<img class="TL92Hc" alt="" id="srpresultimg_7056808077972161656_1_0" src="data:image/webp;base64,.....   "
        // style="height:178px;width:180px" data-iml="1598012974157" data-atf="1">
        WebElement ilkResim =driver.findElement(By.id("srpresultimg_7056808077972161656_1_0"));
        ilkResim.click();
        Thread.sleep(10000);

        driver.quit();
    }
}
