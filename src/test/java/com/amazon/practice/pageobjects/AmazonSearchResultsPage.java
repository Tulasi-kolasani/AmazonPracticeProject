package com.amazon.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonSearchResultsPage {


    WebDriver driver;

    @FindAll(@FindBy(how= How.XPATH, using="//div[contains(@data-cel-widget,'search_result_')]")) private List<WebElement> searchResultsGrid;

    @FindBy(how= How.ID, using="add-to-cart-button") private WebElement addCartButton;

    @FindBy(how= How.ID, using="productTitle") private WebElement productTitle;

    public AmazonSearchResultsPage(WebDriver driver)
    {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public List<WebElement> getSearchResultsGrid()
    {
        return searchResultsGrid;

    }
    public WebElement getAddCartButton() {
        return addCartButton;
    }

    public WebElement getProductTitle() {
        return productTitle;
    }
}


