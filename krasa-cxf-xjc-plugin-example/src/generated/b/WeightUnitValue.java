
package b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weightUnitValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="weightUnitValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GM"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="OZ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "weightUnitValue")
@XmlEnum
public enum WeightUnitValue {

    GM,
    LB,
    KG,
    OZ;

    public String value() {
        return name();
    }

    public static WeightUnitValue fromValue(String v) {
        return valueOf(v);
    }

}
