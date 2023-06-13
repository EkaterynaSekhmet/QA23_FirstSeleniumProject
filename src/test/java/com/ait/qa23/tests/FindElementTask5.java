package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTask5 {

    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test

    public void findElementsByCssTest(){

        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector("#mob-menu-button"));
        driver.findElement(By.cssSelector(".search-box"));
        driver.findElement(By.cssSelector("[type='text/javascript']"));
        driver.findElement(By.cssSelector("[href^='/Themes']"));
        driver.findElement(By.cssSelector("[href^='/Content']"));
        driver.findElement(By.cssSelector("[href*='nivoslider']"));
        driver.findElement(By.cssSelector("[href*='DefaultClean']"));
        driver.findElement(By.cssSelector("[href$='default.css']"));

    }

    @Test

    public void findElementsByXpathTest(){

        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@id='mob-menu-button']"));
        driver.findElement(By.xpath("//*[@class='search-box']"));
        driver.findElement(By.xpath("//*[contains(.,'text/javascript')]"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
        driver.findElement(By.xpath("//*[contains(.,'1')]"));
    }
}
