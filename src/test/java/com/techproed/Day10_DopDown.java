package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day10_DopDown {
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
        driver.get("http://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropDown);

        select.selectByVisibleText("Computers");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        select.selectByIndex(2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }

        select.selectByValue("search-alias=fashion-mens-intl-ship");

        WebElement secim = select.getFirstSelectedOption();
        System.out.println(secim.getText());

        List<WebElement> liste = select.getOptions();

        for (WebElement w : liste) {
            System.out.println(w.getText());
        }

        int toplamSecenekSayisi = liste.size();
        System.out.println("Secenek sayisi : " + toplamSecenekSayisi);
    }


}
