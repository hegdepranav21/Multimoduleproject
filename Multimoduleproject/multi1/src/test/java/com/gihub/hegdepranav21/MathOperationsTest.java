package com.gihub.hegdepranav21;

import org.junit.Assert;
import org.junit.Test;

    public class MathOperationsTest {

        @Test
        public void addTest() {
            MathOperation mathOperations = new MathOperation();
            int result = mathOperations.add(3, 4);
            Assert.assertEquals( 7, result);
        }
    }


