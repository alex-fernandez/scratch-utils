package com.alexfrndz;

import com.alexfrndz.utils.ValidationUtils;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testDateValidationShouldBeValid1() {
        boolean dateValidationValid = ValidationUtils.isValidDateFormatOrEmpty("2014-02-22 23:33:32");
        assertEquals(dateValidationValid, true);
    }

    public void testDateValidationShouldBeValid2() {
        boolean dateValidationValid = ValidationUtils.isValidDateFormatOrEmpty("2014-02-22 08:33:32");
        assertEquals(dateValidationValid, true);
    }

    public void testDateValidationShouldBeInValid() {
        boolean dateValidationValid = ValidationUtils.isValidDateFormatOrEmpty("2014-02-22 08:33:32");
        assertEquals(dateValidationValid, true);
    }

    public void testDateValidationWithEmptyDate() {
        boolean dateValidationValid = ValidationUtils.isValidDateFormatOrEmpty("");
        assertEquals(dateValidationValid, true);
    }

    public void testDateValidationWithNullDate() {
        boolean dateValidationValid = ValidationUtils.isValidDateFormatOrEmpty(null);
        assertEquals(dateValidationValid, true);
    }


}
