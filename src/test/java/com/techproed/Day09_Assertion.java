package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void Test1(){
        driver.get("http://google.com");

        String title = driver.getTitle();
        Assert.assertEquals("Google arama",title);

    }

    @Test
    public void Test2(){
        driver.get("http://amazon.com");
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Amazon");

        Assert.assertTrue(iceriyorMu);
    }

    @Test
    public void Test3(){
        driver.get("http://facebook.com");
        String title = driver.getTitle();
        boolean iceriyorMu = title.contains("Youtube");
        Assert.assertFalse(iceriyorMu);
    }

    @Test
    public void Test4(){
        driver.get("http://google.com");
        String title = driver.getTitle();
        System.out.println("Merhabalar");
        Assert.assertEquals("Google arama sayfasi",title);
    }



    @AfterClass
    public static void tearDown(){
        //driver.quit();
    }



}
