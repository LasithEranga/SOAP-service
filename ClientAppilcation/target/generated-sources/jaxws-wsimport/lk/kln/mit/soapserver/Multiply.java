
package lk.kln.mit.soapserver;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for multiply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="multiply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="secondNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multiply", propOrder = {
    "firstNumber",
    "secondNumber"
})
public class Multiply {

    protected double firstNumber;
    protected double secondNumber;

    /**
     * Gets the value of the firstNumber property.
     * 
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Sets the value of the firstNumber property.
     * 
     */
    public void setFirstNumber(double value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the secondNumber property.
     * 
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Sets the value of the secondNumber property.
     * 
     */
    public void setSecondNumber(double value) {
        this.secondNumber = value;
    }

}
