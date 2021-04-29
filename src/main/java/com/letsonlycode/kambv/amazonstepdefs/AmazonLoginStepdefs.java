package com.letsonlycode.kambv.amazonstepdefs;

import com.letsonlycode.kambv.pageEvents.HomePageEvents;
import com.letsonlycode.kambv.pageEvents.LoginPageEvents;
import com.letsonlycode.kambv.utils.Constants;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class AmazonLoginStepdefs{

    public static WebDriver webDriver;

    public static boolean testStatus = false;

    HomePageEvents homePageEvents;
    LoginPageEvents loginPageEvents;

    @BeforeAll
    public static void setup() {

    }

    @Before
    public void beforeEachTest(Scenario scenario) {
        System.out.println("before each test");
        setupDriver("chrome");
        webDriver.manage().window().maximize();
        webDriver.get(Constants.url);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterEachTest(Scenario scenario) {
        System.out.println("after each test");
        webDriver.quit();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("teardown");
    }

    private void setupDriver(String browser) {
        if ("chrome".equalsIgnoreCase(browser)) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                    File.separator + "drivers" + File.separator + "chromedriver");
            webDriver = new ChromeDriver();
        }
    }

    @Given("^A user opens Amazon\\.in$")
    public void aUserOpensAmazonIn() {
        homePageEvents = new HomePageEvents();
        loginPageEvents = new LoginPageEvents();
    }

    @When("^User clicks on SignIn$")
    public void userClicksOnSignIn() {
        homePageEvents.clickOnSignInButton();
    }

    @Then("^Verify login text appears on the screen$")
    public void verifyLoginTextAppearsOnTheScreen() {
        loginPageEvents.verifyLoginPageOpenedOrNot();
    }

    @Then("^User enters email address$")
    public void userEntersEmailAddress() {
        loginPageEvents.enterEmailId();
        testStatus = true;
    }
}


