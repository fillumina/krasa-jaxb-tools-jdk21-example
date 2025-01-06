package com.fillumina.krasa.jaxbtoolsexample.test;

import org.junit.Test;

/**
 *
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class PatternElementTest extends JavaxBeanValidationHelper {

    @Test
    public void shouldPassValidation() {
        PatternElement bean = new PatternElement();
        bean.setMultiplePatternsWithBase("A");
		bean.setEnumRestrictions("test (123)");

        assertValid(bean);
    }

    @Test
    public void shouldNotPassValidation() {
        PatternElement bean = new PatternElement();
        bean.setMultiplePatternsWithBase("C");
		bean.setEnumRestrictions("test_INVALID");

        assertNotValid(bean);
    }

    @Test(expected = AssertionError.class)
    public void shouldFailNotPassValidation() {
        PatternElement bean = new PatternElement();
        bean.setMultiplePatternsWithBase("A");
		bean.setEnumRestrictions("test (123)");

        assertNotValid(bean);
    }

    @Test(expected = AssertionError.class)
    public void shouldFailPassValidation() {
        PatternElement bean = new PatternElement();
        bean.setMultiplePatternsWithBase("C");
		bean.setEnumRestrictions("test_INVALID");

        assertValid(bean);
    }

}
