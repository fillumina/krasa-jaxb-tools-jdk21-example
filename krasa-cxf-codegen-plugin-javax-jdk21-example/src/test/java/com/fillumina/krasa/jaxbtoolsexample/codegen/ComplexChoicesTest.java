package com.fillumina.krasa.jaxbtoolsexample.codegen;

import a.Coffee;
import a.ComplexChoices;
import a.Tea;
import java.lang.reflect.Field;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlElement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Francesco Illuminati <fillumina@gmail.com>
 */
public class ComplexChoicesTest {
    private static final Class<Valid> VALID_CLASS = Valid.class;
    private static final Class<XmlElement> XML_BIND_ANNOTATION = XmlElement.class;

    @Test
    public void shouldValidAnnotationOnTea() throws NoSuchFieldException {
        Field teaField = ComplexChoices.class.getDeclaredField("tea");
        Object valid = teaField.getAnnotation(VALID_CLASS);
        assertNotNull(valid);
    }

    @Test
    public void shouldBindAnnotationOnTea() throws NoSuchFieldException {
        Field teaField = ComplexChoices.class.getDeclaredField("tea");
        Object xmlElement = teaField.getAnnotation(XML_BIND_ANNOTATION);
        assertNotNull(xmlElement);
    }

    @Test
    public void shouldCreateComplexChoices() {
        ComplexChoices c = new ComplexChoices();
        assertNotNull(c);
    }

    @Test
    public void shouldSetTea() {
        ComplexChoices c = new ComplexChoices();
        c.setTea(createTea("Earl Grey"));

        assertEquals("Earl Grey", c.getTea().getFoo());
    }

    @Test
    public void shouldSetCoffee() {
        ComplexChoices c = new ComplexChoices();
        c.setCoffee(createCoffee("Arabica"));

        assertEquals("Arabica", c.getCoffee().getBar());
    }

    @Test
    public void shouldReturnEqualHashcodeForEqualObjects() {
        Coffee coffee = createCoffee("Robusta");
        Tea tea = createTea("Green");

        ComplexChoices c1 = new ComplexChoices();
        c1.setCoffee(coffee);
        c1.setTea(tea);

        ComplexChoices c2 = new ComplexChoices();
        c2.setCoffee(coffee);
        c2.setTea(tea);

        assertNotEquals(0, c1.hashCode());
        assertNotEquals(0, c2.hashCode());
        assertEquals(c1.hashCode(), c2.hashCode() );
    }

    @Test
    public void shouldReturnDifferentHashcodeForDifferentObjects() {
        ComplexChoices c1 = new ComplexChoices();
        c1.setCoffee(createCoffee("Robusta"));
        c1.setTea(createTea("Green"));

        ComplexChoices c2 = new ComplexChoices();
        c2.setCoffee(createCoffee("Arabica"));
        c2.setTea(createTea("Earl Grey"));

        assertNotEquals(0, c1.hashCode());
        assertNotEquals(0, c2.hashCode());
        assertNotEquals(c1.hashCode(), c2.hashCode() );
    }

    @Test
    public void shouldBeEqualForEqualObjects() {
        Coffee coffee = createCoffee("Robusta");
        Tea tea = createTea("Green");

        ComplexChoices c1 = new ComplexChoices();
        c1.setCoffee(coffee);
        c1.setTea(tea);

        ComplexChoices c2 = new ComplexChoices();
        c2.setCoffee(coffee);
        c2.setTea(tea);

        assertTrue(c1.equals(c2));
        assertTrue(c2.equals(c1));
    }

    @Test
    public void shouldBeNotEqualsForDifferentObjects() {
        ComplexChoices c1 = new ComplexChoices();
        c1.setCoffee(createCoffee("Robusta"));
        c1.setTea(createTea("Green"));

        ComplexChoices c2 = new ComplexChoices();
        c2.setCoffee(createCoffee("Arabica"));
        c2.setTea(createTea("Earl Grey"));

        assertFalse(c1.equals(c2));
        assertFalse(c2.equals(c1));
    }

    private Coffee createCoffee(String name) {
        Coffee coffee = new Coffee();
        coffee.setBar(name);
        return coffee;
    }

    private Tea createTea(String name) {
        Tea tea = new Tea();
        tea.setFoo("Earl Grey");
        return tea;
    }

}
