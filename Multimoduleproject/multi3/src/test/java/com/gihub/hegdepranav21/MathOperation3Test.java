package com.gihub.hegdepranav21;

import org.junit.Assert;
import org.junit.Test;

public class MathOperation3Test {

    @Test
    public void addTest() {
        MathOperation3 mathOperations = new MathOperation3();
        int result = mathOperations.add(3, 4);
        Assert.assertEquals(7, result);


    }
}
