
package net.restfulwebservices.servicecontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.restfulwebservices.datacontracts._2008._01.Weather;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetForecastByCityResult" type="{http://www.restfulwebservices.net/DataContracts/2008/01}Weather" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getForecastByCityResult"
})
@XmlRootElement(name = "GetForecastByCityResponse")
public class GetForecastByCityResponse {

    @XmlElementRef(name = "GetForecastByCityResult", namespace = "http://www.restfulwebservices.net/ServiceContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<Weather> getForecastByCityResult;

    /**
     * Gets the value of the getForecastByCityResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Weather }{@code >}
     *     
     */
    public JAXBElement<Weather> getGetForecastByCityResult() {
        return getForecastByCityResult;
    }

    /**
     * Sets the value of the getForecastByCityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Weather }{@code >}
     *     
     */
    public void setGetForecastByCityResult(JAXBElement<Weather> value) {
        this.getForecastByCityResult = value;
    }

}
