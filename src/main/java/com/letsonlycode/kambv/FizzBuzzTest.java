package com.letsonlycode.kambv;

import com.letsonlycode.kambv.FizzBuzz;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;

@RunWith(JUnitPlatform.class)
class FizzBuzzTest {

    public FizzBuzz fB;
    private static boolean testStatus;

    @BeforeAll
    public static void setup() {
        System.out.println("Setup");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("teardown");
    }

    @BeforeEach
    public void beforeEachTest() {
        //System.out.println("before each test");
        fB = new FizzBuzz();
        testStatus = false;

        Arrays.asList(new int[]{1, 2});

    }

    @AfterEach
    public void afterEachTest(TestInfo testInfo) {
        //System.out.println("after each test");
        fB = null;
        String status = testStatus ? "Passed" : "Failed";
        System.out.println("Test Case: " + testInfo.getTestMethod().get().getName() + " " + status);
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
        testStatus = true;
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
        testStatus = true;
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
        testStatus = true;
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
        testStatus = true;
    }
}