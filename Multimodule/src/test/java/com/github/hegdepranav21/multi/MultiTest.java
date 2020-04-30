package com.github.hegdepranav21.multi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

    /**
     * Unit test for simple App.
     */
    public class MultiTest {
            extends TestCase {
        /**
         * Create the test case
         *
         * @param testName name of the test case
         */
        public MultiTest(String testName) {
            super(testName);
        }

        /**
         * @return the suite of tests being tested
         */
        public static Test suite() {
            return new TestSuite(MultiTest.class);
        }

        /**
         * Rigourous Test :-)
         */
        public void testApp() {
            assertTrue(true);
        }
    }
}
