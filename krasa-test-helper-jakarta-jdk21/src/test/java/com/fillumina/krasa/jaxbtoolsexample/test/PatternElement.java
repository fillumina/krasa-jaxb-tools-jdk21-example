
package com.fillumina.krasa.jaxbtoolsexample.test;

import jakarta.validation.constraints.Pattern;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PatternElement complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PatternElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="multiplePatternsWithBase" type="{a}patternList" minOccurs="0"/&gt;
 *         &lt;element name="enumRestrictions" type="{a}enumRestrictions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatternElement", propOrder = {
    "multiplePatternsWithBase",
    "enumRestrictions"
})
public class PatternElement {

    @Pattern(regexp = "([0-9])|([A-B])|([A-Z])")
    protected String multiplePatternsWithBase;
    @Pattern(regexp = "(\\Qtest 123\\E)|(\\Qtest (123)\\E)")
    protected String enumRestrictions;

    /**
     * Gets the value of the multiplePatternsWithBase property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMultiplePatternsWithBase() {
        return multiplePatternsWithBase;
    }

    /**
     * Sets the value of the multiplePatternsWithBase property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMultiplePatternsWithBase(String value) {
        this.multiplePatternsWithBase = value;
    }

    /**
     * Gets the value of the enumRestrictions property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnumRestrictions() {
        return enumRestrictions;
    }

    /**
     * Sets the value of the enumRestrictions property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnumRestrictions(String value) {
        this.enumRestrictions = value;
    }

}
