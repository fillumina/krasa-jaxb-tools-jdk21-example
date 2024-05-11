
package a;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Main complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Main"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="multiplePatternsWithBase" type="{a}patternList" minOccurs="0"/&gt;
 *         &lt;element name="numbers" type="{a}Numbers"/&gt;
 *         &lt;element name="strings" type="{a}Strings"/&gt;
 *         &lt;element name="unsignedByte" type="{a}unsignedByte"/&gt;
 *         &lt;element name="choices" type="{a}Choices"/&gt;
 *         &lt;element name="complexChoices" type="{a}ComplexChoices"/&gt;
 *         &lt;element name="choicesWithMinMax" type="{a}ChoicesWithMinMax"/&gt;
 *         &lt;element name="complexChoicesWithMinMax" type="{a}ComplexChoicesWithMinMax"/&gt;
 *         &lt;element name="enumerations" type="{a}Enumerations"/&gt;
 *         &lt;element name="enumeration" type="{a}Enumeration"/&gt;
 *         &lt;element name="array" type="{a}ArrayOfBytes"/&gt;
 *         &lt;element name="primitives" type="{a}Primitives"/&gt;
 *         &lt;element name="dateOrDateTimeType" type="{a}DateOrDateTimeType"/&gt;
 *         &lt;element name="timeInstantType" type="{a}TimeInstantType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Main", propOrder = {
    "multiplePatternsWithBase",
    "numbers",
    "strings",
    "unsignedByte",
    "choices",
    "complexChoices",
    "choicesWithMinMax",
    "complexChoicesWithMinMax",
    "enumerations",
    "enumeration",
    "array",
    "primitives",
    "dateOrDateTimeType",
    "timeInstantType"
})
public class Main
    implements Equals, HashCode
{

    @Pattern.List({
        @Pattern(regexp = "[A-Z]"),
        @Pattern(regexp = "([0-9])|([A-B])")
    })
    protected String multiplePatternsWithBase;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Numbers numbers;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Strings strings;
    @XmlSchemaType(name = "unsignedByte")
    @NotNull
    @DecimalMin("0")
    @DecimalMax("255")
    protected short unsignedByte;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Choices choices;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected ComplexChoices complexChoices;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected ChoicesWithMinMax choicesWithMinMax;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected ComplexChoicesWithMinMax complexChoicesWithMinMax;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Enumerations enumerations;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Enumeration enumeration;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    @NotNull
    @Size(max = 18)
    protected byte[] array;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected Primitives primitives;
    @XmlElement(required = true)
    @NotNull
    protected String dateOrDateTimeType;
    @XmlElement(required = true)
    @NotNull
    @Valid
    protected TimeInstantType timeInstantType;

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
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link Numbers }
     *     
     */
    public Numbers getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Numbers }
     *     
     */
    public void setNumbers(Numbers value) {
        this.numbers = value;
    }

    /**
     * Gets the value of the strings property.
     * 
     * @return
     *     possible object is
     *     {@link Strings }
     *     
     */
    public Strings getStrings() {
        return strings;
    }

    /**
     * Sets the value of the strings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Strings }
     *     
     */
    public void setStrings(Strings value) {
        this.strings = value;
    }

    /**
     * Gets the value of the unsignedByte property.
     * 
     */
    public short getUnsignedByte() {
        return unsignedByte;
    }

    /**
     * Sets the value of the unsignedByte property.
     * 
     */
    public void setUnsignedByte(short value) {
        this.unsignedByte = value;
    }

    /**
     * Gets the value of the choices property.
     * 
     * @return
     *     possible object is
     *     {@link Choices }
     *     
     */
    public Choices getChoices() {
        return choices;
    }

    /**
     * Sets the value of the choices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Choices }
     *     
     */
    public void setChoices(Choices value) {
        this.choices = value;
    }

    /**
     * Gets the value of the complexChoices property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexChoices }
     *     
     */
    public ComplexChoices getComplexChoices() {
        return complexChoices;
    }

    /**
     * Sets the value of the complexChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexChoices }
     *     
     */
    public void setComplexChoices(ComplexChoices value) {
        this.complexChoices = value;
    }

    /**
     * Gets the value of the choicesWithMinMax property.
     * 
     * @return
     *     possible object is
     *     {@link ChoicesWithMinMax }
     *     
     */
    public ChoicesWithMinMax getChoicesWithMinMax() {
        return choicesWithMinMax;
    }

    /**
     * Sets the value of the choicesWithMinMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicesWithMinMax }
     *     
     */
    public void setChoicesWithMinMax(ChoicesWithMinMax value) {
        this.choicesWithMinMax = value;
    }

    /**
     * Gets the value of the complexChoicesWithMinMax property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexChoicesWithMinMax }
     *     
     */
    public ComplexChoicesWithMinMax getComplexChoicesWithMinMax() {
        return complexChoicesWithMinMax;
    }

    /**
     * Sets the value of the complexChoicesWithMinMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexChoicesWithMinMax }
     *     
     */
    public void setComplexChoicesWithMinMax(ComplexChoicesWithMinMax value) {
        this.complexChoicesWithMinMax = value;
    }

    /**
     * Gets the value of the enumerations property.
     * 
     * @return
     *     possible object is
     *     {@link Enumerations }
     *     
     */
    public Enumerations getEnumerations() {
        return enumerations;
    }

    /**
     * Sets the value of the enumerations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumerations }
     *     
     */
    public void setEnumerations(Enumerations value) {
        this.enumerations = value;
    }

    /**
     * Gets the value of the enumeration property.
     * 
     * @return
     *     possible object is
     *     {@link Enumeration }
     *     
     */
    public Enumeration getEnumeration() {
        return enumeration;
    }

    /**
     * Sets the value of the enumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumeration }
     *     
     */
    public void setEnumeration(Enumeration value) {
        this.enumeration = value;
    }

    /**
     * Gets the value of the array property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getArray() {
        return array;
    }

    /**
     * Sets the value of the array property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArray(byte[] value) {
        this.array = value;
    }

    /**
     * Gets the value of the primitives property.
     * 
     * @return
     *     possible object is
     *     {@link Primitives }
     *     
     */
    public Primitives getPrimitives() {
        return primitives;
    }

    /**
     * Sets the value of the primitives property.
     * 
     * @param value
     *     allowed object is
     *     {@link Primitives }
     *     
     */
    public void setPrimitives(Primitives value) {
        this.primitives = value;
    }

    /**
     * Gets the value of the dateOrDateTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOrDateTimeType() {
        return dateOrDateTimeType;
    }

    /**
     * Sets the value of the dateOrDateTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOrDateTimeType(String value) {
        this.dateOrDateTimeType = value;
    }

    /**
     * Gets the value of the timeInstantType property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantType }
     *     
     */
    public TimeInstantType getTimeInstantType() {
        return timeInstantType;
    }

    /**
     * Sets the value of the timeInstantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantType }
     *     
     */
    public void setTimeInstantType(TimeInstantType value) {
        this.timeInstantType = value;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theMultiplePatternsWithBase;
            theMultiplePatternsWithBase = this.getMultiplePatternsWithBase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "multiplePatternsWithBase", theMultiplePatternsWithBase), currentHashCode, theMultiplePatternsWithBase);
        }
        {
            Numbers theNumbers;
            theNumbers = this.getNumbers();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numbers", theNumbers), currentHashCode, theNumbers);
        }
        {
            Strings theStrings;
            theStrings = this.getStrings();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strings", theStrings), currentHashCode, theStrings);
        }
        {
            short theUnsignedByte;
            theUnsignedByte = this.getUnsignedByte();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unsignedByte", theUnsignedByte), currentHashCode, theUnsignedByte);
        }
        {
            Choices theChoices;
            theChoices = this.getChoices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choices", theChoices), currentHashCode, theChoices);
        }
        {
            ComplexChoices theComplexChoices;
            theComplexChoices = this.getComplexChoices();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexChoices", theComplexChoices), currentHashCode, theComplexChoices);
        }
        {
            ChoicesWithMinMax theChoicesWithMinMax;
            theChoicesWithMinMax = this.getChoicesWithMinMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "choicesWithMinMax", theChoicesWithMinMax), currentHashCode, theChoicesWithMinMax);
        }
        {
            ComplexChoicesWithMinMax theComplexChoicesWithMinMax;
            theComplexChoicesWithMinMax = this.getComplexChoicesWithMinMax();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complexChoicesWithMinMax", theComplexChoicesWithMinMax), currentHashCode, theComplexChoicesWithMinMax);
        }
        {
            Enumerations theEnumerations;
            theEnumerations = this.getEnumerations();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumerations", theEnumerations), currentHashCode, theEnumerations);
        }
        {
            Enumeration theEnumeration;
            theEnumeration = this.getEnumeration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enumeration", theEnumeration), currentHashCode, theEnumeration);
        }
        {
            byte[] theArray;
            theArray = this.getArray();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "array", theArray), currentHashCode, theArray);
        }
        {
            Primitives thePrimitives;
            thePrimitives = this.getPrimitives();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "primitives", thePrimitives), currentHashCode, thePrimitives);
        }
        {
            String theDateOrDateTimeType;
            theDateOrDateTimeType = this.getDateOrDateTimeType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateOrDateTimeType", theDateOrDateTimeType), currentHashCode, theDateOrDateTimeType);
        }
        {
            TimeInstantType theTimeInstantType;
            theTimeInstantType = this.getTimeInstantType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeInstantType", theTimeInstantType), currentHashCode, theTimeInstantType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Main)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Main that = ((Main) object);
        {
            String lhsMultiplePatternsWithBase;
            lhsMultiplePatternsWithBase = this.getMultiplePatternsWithBase();
            String rhsMultiplePatternsWithBase;
            rhsMultiplePatternsWithBase = that.getMultiplePatternsWithBase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "multiplePatternsWithBase", lhsMultiplePatternsWithBase), LocatorUtils.property(thatLocator, "multiplePatternsWithBase", rhsMultiplePatternsWithBase), lhsMultiplePatternsWithBase, rhsMultiplePatternsWithBase)) {
                return false;
            }
        }
        {
            Numbers lhsNumbers;
            lhsNumbers = this.getNumbers();
            Numbers rhsNumbers;
            rhsNumbers = that.getNumbers();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numbers", lhsNumbers), LocatorUtils.property(thatLocator, "numbers", rhsNumbers), lhsNumbers, rhsNumbers)) {
                return false;
            }
        }
        {
            Strings lhsStrings;
            lhsStrings = this.getStrings();
            Strings rhsStrings;
            rhsStrings = that.getStrings();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strings", lhsStrings), LocatorUtils.property(thatLocator, "strings", rhsStrings), lhsStrings, rhsStrings)) {
                return false;
            }
        }
        {
            short lhsUnsignedByte;
            lhsUnsignedByte = this.getUnsignedByte();
            short rhsUnsignedByte;
            rhsUnsignedByte = that.getUnsignedByte();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unsignedByte", lhsUnsignedByte), LocatorUtils.property(thatLocator, "unsignedByte", rhsUnsignedByte), lhsUnsignedByte, rhsUnsignedByte)) {
                return false;
            }
        }
        {
            Choices lhsChoices;
            lhsChoices = this.getChoices();
            Choices rhsChoices;
            rhsChoices = that.getChoices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "choices", lhsChoices), LocatorUtils.property(thatLocator, "choices", rhsChoices), lhsChoices, rhsChoices)) {
                return false;
            }
        }
        {
            ComplexChoices lhsComplexChoices;
            lhsComplexChoices = this.getComplexChoices();
            ComplexChoices rhsComplexChoices;
            rhsComplexChoices = that.getComplexChoices();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complexChoices", lhsComplexChoices), LocatorUtils.property(thatLocator, "complexChoices", rhsComplexChoices), lhsComplexChoices, rhsComplexChoices)) {
                return false;
            }
        }
        {
            ChoicesWithMinMax lhsChoicesWithMinMax;
            lhsChoicesWithMinMax = this.getChoicesWithMinMax();
            ChoicesWithMinMax rhsChoicesWithMinMax;
            rhsChoicesWithMinMax = that.getChoicesWithMinMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "choicesWithMinMax", lhsChoicesWithMinMax), LocatorUtils.property(thatLocator, "choicesWithMinMax", rhsChoicesWithMinMax), lhsChoicesWithMinMax, rhsChoicesWithMinMax)) {
                return false;
            }
        }
        {
            ComplexChoicesWithMinMax lhsComplexChoicesWithMinMax;
            lhsComplexChoicesWithMinMax = this.getComplexChoicesWithMinMax();
            ComplexChoicesWithMinMax rhsComplexChoicesWithMinMax;
            rhsComplexChoicesWithMinMax = that.getComplexChoicesWithMinMax();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complexChoicesWithMinMax", lhsComplexChoicesWithMinMax), LocatorUtils.property(thatLocator, "complexChoicesWithMinMax", rhsComplexChoicesWithMinMax), lhsComplexChoicesWithMinMax, rhsComplexChoicesWithMinMax)) {
                return false;
            }
        }
        {
            Enumerations lhsEnumerations;
            lhsEnumerations = this.getEnumerations();
            Enumerations rhsEnumerations;
            rhsEnumerations = that.getEnumerations();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enumerations", lhsEnumerations), LocatorUtils.property(thatLocator, "enumerations", rhsEnumerations), lhsEnumerations, rhsEnumerations)) {
                return false;
            }
        }
        {
            Enumeration lhsEnumeration;
            lhsEnumeration = this.getEnumeration();
            Enumeration rhsEnumeration;
            rhsEnumeration = that.getEnumeration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enumeration", lhsEnumeration), LocatorUtils.property(thatLocator, "enumeration", rhsEnumeration), lhsEnumeration, rhsEnumeration)) {
                return false;
            }
        }
        {
            byte[] lhsArray;
            lhsArray = this.getArray();
            byte[] rhsArray;
            rhsArray = that.getArray();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "array", lhsArray), LocatorUtils.property(thatLocator, "array", rhsArray), lhsArray, rhsArray)) {
                return false;
            }
        }
        {
            Primitives lhsPrimitives;
            lhsPrimitives = this.getPrimitives();
            Primitives rhsPrimitives;
            rhsPrimitives = that.getPrimitives();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "primitives", lhsPrimitives), LocatorUtils.property(thatLocator, "primitives", rhsPrimitives), lhsPrimitives, rhsPrimitives)) {
                return false;
            }
        }
        {
            String lhsDateOrDateTimeType;
            lhsDateOrDateTimeType = this.getDateOrDateTimeType();
            String rhsDateOrDateTimeType;
            rhsDateOrDateTimeType = that.getDateOrDateTimeType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateOrDateTimeType", lhsDateOrDateTimeType), LocatorUtils.property(thatLocator, "dateOrDateTimeType", rhsDateOrDateTimeType), lhsDateOrDateTimeType, rhsDateOrDateTimeType)) {
                return false;
            }
        }
        {
            TimeInstantType lhsTimeInstantType;
            lhsTimeInstantType = this.getTimeInstantType();
            TimeInstantType rhsTimeInstantType;
            rhsTimeInstantType = that.getTimeInstantType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeInstantType", lhsTimeInstantType), LocatorUtils.property(thatLocator, "timeInstantType", rhsTimeInstantType), lhsTimeInstantType, rhsTimeInstantType)) {
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
