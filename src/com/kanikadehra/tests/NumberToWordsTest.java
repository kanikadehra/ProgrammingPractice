package com.kanikadehra.tests;

import com.kanikadehra.NumberToWords;
import org.junit.Assert;
import org.junit.Test;

public class NumberToWordsTest {

    @Test
    public void test424ToDigits(){
      // Assert.assertEquals("Four Two Four",NumberToWords.numberToWords(424));
    }

    @Test
    public void reverse356(){
        Assert.assertEquals(653, NumberToWords.reverse(356));
    }

    @Test
    public void getDigitCount235(){

        Assert.assertEquals(3, NumberToWords.getDigitCount(235));
    }

    @Test
    public void getDigitCount0(){

        Assert.assertEquals(1, NumberToWords.getDigitCount(0));
    }
}
