package com.letsonlycode.kambv;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/FizzBuzz.feature"},
        glue = {"com.letsonlycode.kambv"})
public class RunCucumberFizzBuzzTest {

}