package com.kanikadehra.tests;

import com.kanikadehra.FlourPacker;
import org.junit.Assert;
import org.junit.Test;

public class FlourPackerTest {

    @Test
    public void canPackTest1(){

        Assert.assertEquals(true, FlourPacker.canPack(2,10,18));
    }
}
