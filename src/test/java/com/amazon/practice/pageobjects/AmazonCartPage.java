package com.amazon.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPage {

    WebDriver driver;

    @FindBy(how= How.ID, using="cart-about-cart-warning") public WebElement aboutCart;

    @FindBy(how= How.ID, using="activeCartViewForm") public WebElement shoppingCartGrid;

    public AmazonCartPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public WebElement getAboutCart()
    {
        return aboutCart;

    }
    public WebElement getShoppingCartGrid() {
        return shoppingCartGrid;
    }
}
