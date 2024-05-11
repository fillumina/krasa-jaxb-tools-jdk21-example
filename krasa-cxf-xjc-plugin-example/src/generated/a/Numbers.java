
package a;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Numbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Numbers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minInclusive" type="{a}minInclusive"/&gt;
 *         &lt;element name="maxInclusive" type="{a}maxInclusive"/&gt;
 *         &lt;element name="minExclusive" type="{a}minExclusive"/&gt;
 *         &lt;element name="maxExclusive" type="{a}maxExclusive"/&gt;
 *         &lt;element name="minMaxExclusive" type="{a}minMaxExclusive"/&gt;
 *         &lt;element name="NumberWithCode" type="{a}NumberWithCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Numbers", propOrder = {
    "minInclusive",
    "maxInclusive",
    "minExclusive",
    "maxExclusive",
    "minMaxExclusive",
    "numberWithCode"
})
public class Numbers
    implements Equals, HashCode
{

    @NotNull
    @DecimalMin("1000")
    protected long minInclusive;
    @NotNull
    @DecimalMax("1000")
    protected long maxInclusive;
    @NotNull
    @DecimalMin("1")
    protected long minExclusive;
    @NotNull
    @DecimalMax("999")
    protected long maxExclusive;
    @XmlSchemaType(name = "long")
    @NotNull
    protected int minMaxExclusive;
    @XmlElement(name = "NumberWithCode")
    @Valid
    protected NumberWithCode numberWithCode;

    /**
     * Gets the value of the minInclusive property.
     * 
     */
    public long getMinInclusive() {
        return minInclusive;
    }

    /**
     * Sets the value of the minInclusive property.
     * 
     */
    public void setMinInclusive(long value) {
        this.minInclusive = value;
    }

    /**
     * Gets the value of the maxInclusive property.
     * 
     */
    public long getMaxInclusive() {
        return maxInclusive;
    }

    /**
     * Sets the value of the maxInclusive property.
     * 
     */
    public void setMaxInclusive(long value) {
        this.maxInclusive = value;
    }

    /**
     * Gets the value of the minExclusive property.
     * 
     */
    public long getMinExclusive() {
        return minExclusive;
    }

    /**
     * Sets the value of the minExclusive property.
     * 
     */
    public void setMinExclusive(long value) {
        this.minExclusive = value;
    }

    /**
     * Gets the value of the maxExclusive property.
     * 
     */
    public long getMaxExclusive() {
        return maxExclusive;
    }

    /**
     * Sets the value of the maxExclusive property.
     * 
     */
    public void setMaxExclusive(long value) {
        this.maxExclusive = value;
    }

    /**
     * Gets the value of the minMaxExclusive property.
     * 
     */
    public int getMinMaxExclusive() {
        return minMaxExclusive;
    }

    /**
     * Sets the value of the minMaxExclusive property.
     * 
     */
    public void setMinMaxExclusive(int value) {
        this.minMaxExclusive = value;
    }

    /**
     * Gets the value of the numberWithCode property.
     * 
     * @return
     *     possible object is
     *     {@link NumberWithCode }
     *     
     */
    public NumberWithCode getNumberWithCode() {
        return numberWithCode;
    }

    /**
     * Sets the value of the numberWithCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberWithCode }
     *     
     */
    public void setNumberWithCode(NumberWithCode value) {
        this.numberWithCode = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            long theMinInclusive;
            theMinInclusive = this.getMinInclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minInclusive", theMinInclusive), currentHashCode, theMinInclusive);
        }
        {
            long theMaxInclusive;
            theMaxInclusive = this.getMaxInclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxInclusive", theMaxInclusive), currentHashCode, theMaxInclusive);
        }
        {
            long theMinExclusive;
            theMinExclusive = this.getMinExclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minExclusive", theMinExclusive), currentHashCode, theMinExclusive);
        }
        {
            long theMaxExclusive;
            theMaxExclusive = this.getMaxExclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxExclusive", theMaxExclusive), currentHashCode, theMaxExclusive);
        }
        {
            int theMinMaxExclusive;
            theMinMaxExclusive = this.getMinMaxExclusive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minMaxExclusive", theMinMaxExclusive), currentHashCode, theMinMaxExclusive);
        }
        {
            NumberWithCode theNumberWithCode;
            theNumberWithCode = this.getNumberWithCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numberWithCode", theNumberWithCode), currentHashCode, theNumberWithCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Numbers)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Numbers that = ((Numbers) object);
        {
            long lhsMinInclusive;
            lhsMinInclusive = this.getMinInclusive();
            long rhsMinInclusive;
            rhsMinInclusive = that.getMinInclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minInclusive", lhsMinInclusive), LocatorUtils.property(thatLocator, "minInclusive", rhsMinInclusive), lhsMinInclusive, rhsMinInclusive)) {
                return false;
            }
        }
        {
            long lhsMaxInclusive;
            lhsMaxInclusive = this.getMaxInclusive();
            long rhsMaxInclusive;
            rhsMaxInclusive = that.getMaxInclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxInclusive", lhsMaxInclusive), LocatorUtils.property(thatLocator, "maxInclusive", rhsMaxInclusive), lhsMaxInclusive, rhsMaxInclusive)) {
                return false;
            }
        }
        {
            long lhsMinExclusive;
            lhsMinExclusive = this.getMinExclusive();
            long rhsMinExclusive;
            rhsMinExclusive = that.getMinExclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minExclusive", lhsMinExclusive), LocatorUtils.property(thatLocator, "minExclusive", rhsMinExclusive), lhsMinExclusive, rhsMinExclusive)) {
                return false;
            }
        }
        {
            long lhsMaxExclusive;
            lhsMaxExclusive = this.getMaxExclusive();
            long rhsMaxExclusive;
            rhsMaxExclusive = that.getMaxExclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxExclusive", lhsMaxExclusive), LocatorUtils.property(thatLocator, "maxExclusive", rhsMaxExclusive), lhsMaxExclusive, rhsMaxExclusive)) {
                return false;
            }
        }
        {
            int lhsMinMaxExclusive;
            lhsMinMaxExclusive = this.getMinMaxExclusive();
            int rhsMinMaxExclusive;
            rhsMinMaxExclusive = that.getMinMaxExclusive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minMaxExclusive", lhsMinMaxExclusive), LocatorUtils.property(thatLocator, "minMaxExclusive", rhsMinMaxExclusive), lhsMinMaxExclusive, rhsMinMaxExclusive)) {
                return false;
            }
        }
        {
            NumberWithCode lhsNumberWithCode;
            lhsNumberWithCode = this.getNumberWithCode();
            NumberWithCode rhsNumberWithCode;
            rhsNumberWithCode = that.getNumberWithCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numberWithCode", lhsNumberWithCode), LocatorUtils.property(thatLocator, "numberWithCode", rhsNumberWithCode), lhsNumberWithCode, rhsNumberWithCode)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

}
