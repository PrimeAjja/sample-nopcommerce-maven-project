package com.demo.nopcomerce.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by Jay Vaghani on 10/05/2019.
 */
public class TestNG_SoftAsserts {

    @Test
    public void testSum() {
        SoftAssert sa = new SoftAssert();
        System.out.println("\nRunning Test -> testSum");
        SomeClassToTest obj = new SomeClassToTest();
        int result = obj.sumNumbers(1, 2);
        sa.assertEquals(result, 2);
        System.out.println("\nLine after assert 1");
        sa.assertEquals(result, 3);
        System.out.println("\nLine after assert 2");
        sa.assertAll();
    }
}
