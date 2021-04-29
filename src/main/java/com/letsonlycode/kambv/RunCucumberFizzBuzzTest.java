package com.letsonlycode.kambv;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/*
* Author: Vijay Kambala
* */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/FizzBuzz.feature"},
        glue = {"com.letsonlycode.kambv.fizzbuzzstepdefs"})
public class RunCucumberFizzBuzzTest {

}