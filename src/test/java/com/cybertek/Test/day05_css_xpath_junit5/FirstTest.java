package com.cybertek.Test.day05_css_xpath_junit5;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class name should be sth like this
 * SomethingTest.java
 * TestSomething.java
 * SomethingShouldDoThatTest.java
 *
 * Test method : testAddition()
 *               additionTest()
 */

public class FirstTest {

    //Test method is annotated with @TEST Annotation
    //It's a void method with no parameter
    @Test
    public void testAddition(){

        int num1 = 10;
        int num2 = 7;
        int expectedResult = 17;

        Assertions.assertEquals(expectedResult, num1+num2);

    }

    @Test
    public void testString(){
        String msg = "I love Selenium";
        // assert this msg equal "I live Selenium"

        Assertions.assertEquals("I love Selenium", msg);

        //assert this msg starts with "I love"
        //assertTrue method accept 1 parameter as boolean
        Assertions.assertTrue(msg.startsWith("I love"));

    }


}
