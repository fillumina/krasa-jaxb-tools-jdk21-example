
package b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for containerTypeValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="containerTypeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SACK"/&gt;
 *     &lt;enumeration value="GAYLORD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "containerTypeValue")
@XmlEnum
public enum ContainerTypeValue {

    SACK,
    GAYLORD;

    public String value() {
        return name();
    }

    public static ContainerTypeValue fromValue(String v) {
        return valueOf(v);
    }

}
