package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Tekrar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Asus/Documents/Selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement welcome =driver.findElement(By.xpath("//h1"));
        System.out.println(welcome.getText()); //By.xpath("input[@id='welcame']");
//<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement singLinki =driver.findElement(By.xpath("//a[@id='sign-in']"));
        singLinki.click();                              //"//input[@name='commit']"

        WebElement email =driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("qwe@sdd.com");

        WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("1234");
        pass.submit();

        WebElement email2 =driver.findElement(By.xpath("//input[@type='email']"));
        email2.sendKeys("testtechproed@gmail.com");

        WebElement pass2 =driver.findElement(By.xpath("//input[@type='password']"));
        pass2.sendKeys("Test1234!");
        pass2.submit();

        Thread.sleep(5000);
        driver.quit();

    }

}
