package com.letsonlycode.kambv.pageEvents;

import com.letsonlycode.kambv.pageObjects.LoginPageElements;
import com.letsonlycode.kambv.utils.ElementFetch;
import org.junit.jupiter.api.Assertions;

public class LoginPageEvents {

    public void verifyLoginPageOpenedOrNot() {
        ElementFetch elementFetch = new ElementFetch();
        Assertions.assertTrue(elementFetch.getWebElements("XPATH",
                LoginPageElements.loginText).size() > 0, "Login page is not opened...");
    }

    public void enterEmailId() {
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).
                sendKeys("kambalavijay@gmail.com");

    }
}
