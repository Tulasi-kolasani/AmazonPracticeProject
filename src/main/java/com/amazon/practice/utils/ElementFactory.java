package com.amazon.practice.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class ElementFactory extends DriverFactory {

    public static final int TIME_OUT=120;
    private static Logger logger = Logger.getLogger(ElementFactory.class.getName());
    private static int tries;
    private ElementFactory () {}
    /*public static WebElement getElement(String webElementIdentifier) throws Exception{


    }

    public static List<WebElement> getElements (String webElementIdentifier) throws Exception
    {


    }
*/
    public static void waitTillElementIsVisible(By by)
    {

        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static By typeCastToBy(WebElement element)
    {

        String[] data = element.toString().split(" -> ")[1].split(": ");
        String locator = data[0];
        String term = data[1];
        System.out.println("Element:"+element.toString());

         switch (locator) {
            case "xpath":
                term=term.replace("\"]", "\"");
                return By.xpath(term);
            case "cssSelector":
                return By.cssSelector(term);
            case "id":
                term=term.replace("]", "");
                return By.id(term);
            case "tagName":
                return By.tagName(term);
            case "name":
                return By.name(term);
            case "linkText":
                return By.linkText(term);
            case "className":
                return By.className(term);
        }
        return (By)element;
    }
}
