package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_IkinciOrnek {

    static WebDriver driver;

    @Before
    public void testtenOnce(){
        driver.get("https://google.com");
    }

    @After
    public void testtenSonra(){
        WebElement sonuc = driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
    }

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test
    public void Test1(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("elma");
        arama.submit();
    }

    @Test
    public void Test2(){
        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("samsung kulaklik");
        arama.submit();

    }

    @Test
    public void Test3(){
        WebElement arama = driver.findElement(By.name("q"));
        arama.sendKeys("calisma sandalyesi");
        arama.submit();

    }

}
