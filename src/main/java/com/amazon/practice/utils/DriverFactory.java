package com.amazon.practice.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
     public static WebDriver driver;
     static String browserName;
     static String URL= "https://www.amazon.com/";

    public static WebDriver getDriver() throws Exception
    {
       // String browserName = EnvironmentConfig.getBrowserType();
        browserName="Chrome";
        switch(browserName)
        {
            case "IE":
                System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\configurations\\drivers\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();

            case "Chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\configurations\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();

/*            case "Firefox":
                driver= new FirefoxDriver();*/
        }
        driver.get(URL);
        driver.manage().window().maximize();

        return driver;
    }


}
