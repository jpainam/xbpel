
package net.restfulwebservices.datacontracts._2008._01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Weather complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Weather">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Wind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Visibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SkyConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Temperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DewPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pressure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Weather", propOrder = {
    "location",
    "time",
    "wind",
    "visibility",
    "skyConditions",
    "temperature",
    "dewPoint",
    "relativeHumidity",
    "pressure"
})
public class Weather {

    @XmlElementRef(name = "Location", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> location;
    @XmlElementRef(name = "Time", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> time;
    @XmlElementRef(name = "Wind", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wind;
    @XmlElementRef(name = "Visibility", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visibility;
    @XmlElementRef(name = "SkyConditions", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> skyConditions;
    @XmlElementRef(name = "Temperature", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> temperature;
    @XmlElementRef(name = "DewPoint", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dewPoint;
    @XmlElementRef(name = "RelativeHumidity", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relativeHumidity;
    @XmlElementRef(name = "Pressure", namespace = "http://www.restfulwebservices.net/DataContracts/2008/01", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pressure;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocation(JAXBElement<String> value) {
        this.location = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTime(JAXBElement<String> value) {
        this.time = value;
    }

    /**
     * Gets the value of the wind property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWind() {
        return wind;
    }

    /**
     * Sets the value of the wind property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWind(JAXBElement<String> value) {
        this.wind = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisibility(JAXBElement<String> value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the skyConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSkyConditions() {
        return skyConditions;
    }

    /**
     * Sets the value of the skyConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSkyConditions(JAXBElement<String> value) {
        this.skyConditions = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemperature(JAXBElement<String> value) {
        this.temperature = value;
    }

    /**
     * Gets the value of the dewPoint property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDewPoint() {
        return dewPoint;
    }

    /**
     * Sets the value of the dewPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDewPoint(JAXBElement<String> value) {
        this.dewPoint = value;
    }

    /**
     * Gets the value of the relativeHumidity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Sets the value of the relativeHumidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelativeHumidity(JAXBElement<String> value) {
        this.relativeHumidity = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPressure(JAXBElement<String> value) {
        this.pressure = value;
    }

}
