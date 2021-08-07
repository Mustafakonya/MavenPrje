package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day10_isDisplayedOrnek {
    static WebDriver driver;

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void titleTest(){

        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Best");
        Assert.assertTrue(iceriyorMu);
    }

    @Test
    public void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo']"));
        boolean gorunuyorMu = logo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @Test
    public void mexicoTest(){
        WebElement mexicologo = driver.findElement(By.partialLinkText("Mexico"));
        boolean gorunuyorMu = mexicologo.isDisplayed();
        Assert.assertTrue(gorunuyorMu);
    }

    @After
    public void after(){
        driver.quit();
    }


}
