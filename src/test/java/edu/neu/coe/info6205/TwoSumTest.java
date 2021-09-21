package edu.neu.coe.info6205;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testToString() {
        final TwoSum target = new TwoSum(10);
        final String s = target.toString();
        Assert.assertEquals("TwoSum(n=10);", s);
    }
}
