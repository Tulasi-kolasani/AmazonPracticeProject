package com.amazon.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

    WebDriver driver;

    @FindBy(how= How.XPATH, using="//*[@id=\"nav-xshop\"]") private WebElement amazonProducts;

    @FindBy(how= How.XPATH, using="//*[@id=\"anonCarousel1\"]/ol") private WebElement homePageCarousel;

    @FindBy(how= How.XPATH, using="//*[@id=\"gw-desktop-herotator\"]/div/div/div/div[3]/a/i") private WebElement carouselNext;

    @FindBy(how= How.XPATH, using="//*[@id=\"nav-link-accountList\"]") private WebElement signInLink;

    @FindBy(how= How.XPATH, using="//*[@id=\"nav-cart\"]") private WebElement amazonCartLink;

    @FindBy(how= How.ID, using="twotabsearchtextbox") private WebElement searchTextbox;

    @FindBy(how= How.ID, using="nav-search-submit-button") private WebElement searchSubmitButton;

    @FindBy(how= How.ID, using="nav-cart-count") private WebElement cartCountText;

    public AmazonHomePage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public WebElement getAmazonProducts()
    {
        return amazonProducts;

    }

    public WebElement getHomePageCarousel()
    {
        return homePageCarousel;

    }

    public WebElement getCarouselNext()
    {
        return carouselNext;

    }

    public WebElement getSignInLink()
    {
        return signInLink;

    }

    public WebElement getAmazonCartLink()
    {
        return amazonCartLink;

    }

    public WebElement getSearchTextbox() {
        return searchTextbox;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getCartCountText() {
        return cartCountText;
    }

}
