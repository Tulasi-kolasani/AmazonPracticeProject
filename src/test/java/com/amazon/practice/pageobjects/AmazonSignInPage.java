package com.amazon.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignInPage {

    WebDriver driver;


    @FindBy(how= How.XPATH, using="//*[@id=\"ap_email\"]") public WebElement emailID;

    public AmazonSignInPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public WebElement getEmailID()
    {
        return emailID;

    }
}
