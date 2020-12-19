package com.letsonlycode.kambv.pageEvents;

import com.letsonlycode.kambv.pageObjects.HomePageElements;
import com.letsonlycode.kambv.utils.ElementFetch;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
    }
}
