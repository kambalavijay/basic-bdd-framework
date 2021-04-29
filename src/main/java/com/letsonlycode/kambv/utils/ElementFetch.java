package com.letsonlycode.kambv.utils;

import com.letsonlycode.kambv.amazonstepdefs.AmazonLoginStepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementFetch {

    public WebElement getWebElement(String identifierType, String identifierValue){

        switch (identifierType){
            case "ID":
                return AmazonLoginStepdefs.webDriver.findElement(By.id(identifierValue));
            case "CSS":
                return AmazonLoginStepdefs.webDriver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return AmazonLoginStepdefs.webDriver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return AmazonLoginStepdefs.webDriver.findElement(By.xpath(identifierValue));
            default:
                return null;
        }
    }

    public List<WebElement> getWebElements(String identifierType, String identifierValue){

        switch (identifierType){
            case "ID":
                return AmazonLoginStepdefs.webDriver.findElements(By.id(identifierValue));
            case "CSS":
                return AmazonLoginStepdefs.webDriver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return AmazonLoginStepdefs.webDriver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return AmazonLoginStepdefs.webDriver.findElements(By.xpath(identifierValue));
            default:
                return null;
        }
    }
}
