package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_IlkDers {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://amazon.com");

        WebElement arama = driver.findElement(By.xpath("//input[@type='text']"));
        arama.sendKeys("samsung headphones" + Keys.ENTER);
        //arama.submit();

        WebElement yazi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(yazi.getText());

        //WebElement urun = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        //System.out.println(urun.getText());

        List<WebElement> urunListesi = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        for (WebElement w : urunListesi) {
            System.out.println(w.getText());
            System.out.println("-----------------------------------");
        }


    }

}
