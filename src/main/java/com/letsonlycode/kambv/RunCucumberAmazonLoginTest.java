package com.letsonlycode.kambv;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/AmazonLogin.feature"},
        glue = {"com.letsonlycode.kambv"},
        plugin = {"pretty", "json:reports/report.json", "junit:reports/report.xml", "html:reports/cucumber-html-report",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                }
        )
public class RunCucumberAmazonLoginTest {

        @BeforeClass
        public static void setup() {
                System.out.println("setup");
        }

        @AfterClass
        public static void tearDown() {
                System.out.println("teardown");
        }

}