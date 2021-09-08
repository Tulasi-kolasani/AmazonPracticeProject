package com.amazon.practice.stepdefinitions;

import com.amazon.practice.pageobjects.AmazonHomePage;
import com.amazon.practice.pageobjects.AmazonSearchResultsPage;
import com.amazon.practice.utils.CommonUtils;
import com.amazon.practice.utils.DriverFactory;
import com.amazon.practice.utils.ElementFactory;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AmazonSearchResultsPageStepDefinition extends DriverFactory {

    AmazonSearchResultsPage searchResultsGrid= new AmazonSearchResultsPage(driver);
    AmazonHomePage homePage = new AmazonHomePage(driver);


    @Then("User select one of the item from search results")
    public void selectItemFromSearchResults() throws Exception
    {

   //     List<WebElement> searchResults = searchResultsGrid.getSearchResultsGrid().findElements(By.tagName("a"));

        System.out.println("Number of search results"+searchResultsGrid.getSearchResultsGrid().size());

        if(searchResultsGrid.getSearchResultsGrid().size()>10)
        {
            int randomNum = CommonUtils.randomNumberGenerator(15,searchResultsGrid.getSearchResultsGrid().size()-1);
            searchResultsGrid.getSearchResultsGrid().get(randomNum).findElement(By.tagName("a")).click();

        }


    }
    @Then("User will add the item to cart")
    public void addItemToCart () throws Exception
    {
        ElementFactory.waitTillElementIsVisible(ElementFactory.typeCastToBy(searchResultsGrid.getAddCartButton()));

        CommonUtils.writeRunTimeDataToFile("ProductTitle",searchResultsGrid.getProductTitle().getText());

        searchResultsGrid.getAddCartButton().click();
        if(Integer.valueOf(homePage.getCartCountText().getText())<1) {
            Thread.sleep(2000);
        }

        Assert.assertTrue("Item is not added to Cart",(Integer.valueOf(homePage.getCartCountText().getText())>=1));
    }



}
