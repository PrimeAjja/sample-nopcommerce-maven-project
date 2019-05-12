package com.demo.nopcomerce.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani on 10/05/2019.
 */
public class TestNG_Prioritiy {
    @BeforeClass
    public void setUp() {
        System.out.println("TestNG_Prioritiy -> before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("TestNG_Prioritiy -> after class");
    }

    @Test
    public void testMethod1() {
        System.out.println("TestNG_Prioritiy -> testMethod1");
    }

    @Test(priority = 0)
    public void testMethod2() {
        System.out.println("TestNG_Prioritiy -> testMethod2");
    }

    @Test
    public void testMethod3() {
        System.out.println("TestNG_Prioritiy -> testMethod3");
    }
}
