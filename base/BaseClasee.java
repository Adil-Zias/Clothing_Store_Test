package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClasee {



    String URL = "http://automationpractice.com/index.php";
    String chromeDriverPath = "D:\\src\\clothing_store\\src\\com\\drivers\\chromedriver.exe";
    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();


    }
    @AfterMethod
    public void ending() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
