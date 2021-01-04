package com.letsonlycode.kambv;

import com.letsonlycode.kambv.pageEvents.HomePageEvents;
import com.letsonlycode.kambv.pageEvents.LoginPageEvents;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class AmazonLoginTest {

    @Test
    public void loginTest(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLoginPageOpenedOrNot();
        loginPageEvents.enterEmailId();

    }

}
