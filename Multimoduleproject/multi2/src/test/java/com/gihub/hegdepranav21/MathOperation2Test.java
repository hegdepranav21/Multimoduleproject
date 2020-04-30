package com.gihub.hegdepranav21;

import org.junit.Assert;
import org.junit.Test;

public class MathOperation2Test {

    @Test
    public void addTest() {
        MathOperation2 mathOperations = new MathOperation2();
        int result = mathOperations.add(3, 4);
        Assert.assertEquals( 7, result);
    }
}
