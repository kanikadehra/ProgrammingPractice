package com.kanikadehra.tests;

import com.kanikadehra.PerfectNumber;
import org.junit.Assert;
import org.junit.Test;

public class PerfectNumberTest {

    @Test
    public void checkIfSixIsPerfectNumber(){
        Assert.assertTrue(PerfectNumber.isPerfectNumber(6));
    }

    @Test
    public void checkIfTenIsPerfectNumber(){
        Assert.assertFalse(PerfectNumber.isPerfectNumber(10));
    }
}
