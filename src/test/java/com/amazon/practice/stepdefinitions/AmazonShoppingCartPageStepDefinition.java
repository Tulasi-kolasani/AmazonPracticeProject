package com.amazon.practice.stepdefinitions;

import com.amazon.practice.pageobjects.AmazonCartPage;
import com.amazon.practice.pageobjects.AmazonHomePage;
import com.amazon.practice.utils.CommonUtils;
import com.amazon.practice.utils.DriverFactory;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AmazonShoppingCartPageStepDefinition extends DriverFactory {

    AmazonCartPage cartPage = new AmazonCartPage(driver);

    @Then("Validate that added item is displayed in Cart screen")
    public void validateItemInShoppingCartPage() throws Exception {

        String itemDescription = cartPage.getShoppingCartGrid().findElements(By.tagName("li"))
                                        .get(0).findElements(By.tagName("span")).get(4).getText();

        String expectedItemDescription = CommonUtils.readRunTimeDataFromFile("ProductTitle");

        System.out.println("\n"+"itemDescription:"+itemDescription);

        System.out.println("expectedItemDescription"+expectedItemDescription);

        Assert.assertTrue("Item is not added to shopping cart",expectedItemDescription.equalsIgnoreCase(itemDescription));





    }
}
