package com.amazon.practice.stepdefinitions;

import com.amazon.practice.constants.CommonConstants;
import com.amazon.practice.pageobjects.AmazonCartPage;
import com.amazon.practice.pageobjects.AmazonHomePage;
import com.amazon.practice.pageobjects.AmazonSignInPage;
import com.amazon.practice.utils.DriverFactory;
import com.amazon.practice.utils.ElementFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AmazonHomePageStepDefinition extends DriverFactory {

    List<String> productList = new ArrayList<String>();
    AmazonHomePage homePage = new AmazonHomePage(driver);
    AmazonSignInPage signInPage = new AmazonSignInPage(driver);
    AmazonCartPage cartPage = new AmazonCartPage(driver);

    @Then("I get all the Amazon products list")
    public void printAllProducts()
    {

        List<WebElement> products = homePage.getAmazonProducts().findElements(By.tagName("a"));

        for(int i=0; i<products.size();i++)
        {

            if(!(products.get(i).getText().equalsIgnoreCase("")))
            {
                productList.add(products.get(i).getText());
            }
        }

        System.out.println("Product List Size:"+productList.size()+"\n");
        System.out.println("Product List :"+productList);

    }

    @Then("I validate the product list is correct or not")
    public void validateTheProducts()
    {
        Assert.assertTrue("Product List on the UI is not correct",productList.equals(CommonConstants.AMAZON_PRODUCTS));

    }

    @Then("I validate the home page Carousel functionality")
    public void validateCarousel() {

        List<WebElement> itemsInCarousel = homePage.getHomePageCarousel().findElements(By.tagName("li"));

        int counter = 0;

        for(int i =0;i<itemsInCarousel.size();i++)
        {
            if(itemsInCarousel.get(i).getAttribute("aria-hidden").equalsIgnoreCase("false"))
            {

                for(int j =i;counter<=itemsInCarousel.size();)
                {
                    System.out.println(itemsInCarousel.get(j).findElement(By.tagName("img")).getAttribute("src"));
                    counter++;
                    homePage.getCarouselNext().click();

                    if(j == itemsInCarousel.size()-1)
                    {
                        j=0;
                    }
                    else
                    {
                        j++;
                    }
                }

                break;
            }


        }

    }

    @When("User clicks on Sign in link in homepage")
    public void navigateToSignInPage()
    {
        homePage.getSignInLink().click();
    }

    @Then("User navigates to Sign in screen")
    public void validateUserInSignInPage()
    {
        ElementFactory.waitTillElementIsVisible(ElementFactory.typeCastToBy(signInPage.getEmailID()));
        System.out.println("Page Title:"+driver.getTitle());
        Assert.assertTrue("User is not in Sign-In page.",driver.getTitle().contains("Sign-In"));
    }

    @When("User clicks on Cart link")
    public void navigateToAmazonCart()
    {
        homePage.getAmazonCartLink().click();
    }

    @Then("User navigates to Amazon Cart screen")
    public void validateUserInShoppingCartPage()
    {
        ElementFactory.waitTillElementIsVisible(ElementFactory.typeCastToBy(cartPage.getAboutCart()));
        System.out.println("Page Title:"+driver.getTitle());
        Assert.assertTrue("User is not in Shopping Cart page.",driver.getTitle().contains("Shopping Cart"));
    }

    @Then("User search the \"([^\"]*)\"")
    public void searchItems(String searchItem) {
        homePage.getSearchTextbox().sendKeys(searchItem);
        homePage.getSearchSubmitButton().click();

    }

    @When("User clicks on language dropdown")
    public void clickOnLanguageDropdown() {
        homePage.getLanguageDropdown().click();
        ElementFactory.waitTillElementIsVisible(ElementFactory.typeCastToBy(homePage.getLanguagePageSaveButton()));
        Assert.assertTrue("User is not in Language Settings page",driver.getTitle().equalsIgnoreCase("Change Language & Currency Settings"));

    }

    @Then("Validate that language selection is working correctly in language settings page")
    public void languageSelectionValidation() {
       /* Validate that by default English is selected*/
        Assert.assertTrue("English option is not selected",homePage.getEnglishRadio().isSelected());

        /* Select Spanish option and validate that radio button is selected */

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", homePage.getSpanishRadio());

        Assert.assertTrue("Spanish option is not selected",homePage.getSpanishRadio().isSelected());


    }



}
