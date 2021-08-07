package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayed {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void Test1(){
        driver.get("http://google.com");
        WebElement logo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        boolean gorunuyorMu = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);

    }
    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }

}
